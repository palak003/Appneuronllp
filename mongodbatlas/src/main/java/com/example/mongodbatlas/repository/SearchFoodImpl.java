package com.example.mongodbatlas.repository;

import com.example.mongodbatlas.entity.FoodItems;

import java.util.List;

public class SearchFoodImpl implements SearchFoodRepository{
    @Override
    public List<FoodItems> findByText(String text) {
        return null;
    }
}
