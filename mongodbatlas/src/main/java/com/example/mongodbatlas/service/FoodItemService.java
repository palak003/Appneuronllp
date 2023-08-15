package com.example.mongodbatlas.service;

import com.example.mongodbatlas.entity.FoodItems;
import com.example.mongodbatlas.repository.FoodItemRepository;
import com.example.mongodbatlas.repository.SearchFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository foodItemRepository;
    @Autowired
    private SearchFoodRepository searchFoodRepository;

    public FoodItems saveFoodItem(FoodItems foodItems){
        return foodItemRepository.save(foodItems);
    }


    public List<FoodItems> search(String query) {
        return searchFoodRepository.findByText(query);
    }
}
