package com.example.mongodbatlas.repository;

import com.example.mongodbatlas.entity.FoodItems;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class SearchFoodImpl implements SearchFoodRepository {

    @Autowired
    MongoClient mongoClient;
    @Autowired
    MongoConverter mongoConverter;

    @Override
    public List<FoodItems> findByText(String text) {
        List<FoodItems> foodItems = new ArrayList<>();
        MongoDatabase database = mongoClient.getDatabase("fooditems");
        MongoCollection<Document> collection = database.getCollection("foodItem");
        AggregateIterable<Document> result = collection.aggregate(List.of(new Document("$search",
                new Document("index", "default")
                        .append("autocomplete", new Document("query", text)
                                .append("path", "name")
                                .append("tokenOrder", "any")
                                .append("fuzzy", new Document("maxEdits", 1L)
                                        .append("prefixLength", 2L))))));
        result.forEach(doc-> foodItems.add(mongoConverter.read(FoodItems.class,doc)));
        return foodItems;
    }
}
