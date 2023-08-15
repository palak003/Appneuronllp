package com.example.mongodbatlas.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foodItem")
@Data
public class FoodItems {
    @Id
    private String id;
    private String name;
}
