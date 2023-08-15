package com.example.mongodbatlas.repository;

import com.example.mongodbatlas.entity.FoodItems;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends MongoRepository<FoodItems,String> {

}
