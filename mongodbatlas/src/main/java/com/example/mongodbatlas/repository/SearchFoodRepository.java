package com.example.mongodbatlas.repository;

import com.example.mongodbatlas.entity.FoodItems;

import java.util.List;

public interface SearchFoodRepository {
    List<FoodItems> findByText(String text);
}
