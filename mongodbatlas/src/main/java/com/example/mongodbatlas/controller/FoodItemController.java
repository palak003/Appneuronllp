package com.example.mongodbatlas.controller;

import com.example.mongodbatlas.entity.FoodItems;
import com.example.mongodbatlas.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/food")
    public ResponseEntity<?> saveFoodItem(@RequestBody FoodItems foodItems){
        return new ResponseEntity<>(foodItemService.saveFoodItem(foodItems), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchFoodItems(@RequestParam String query) {
        return new ResponseEntity<>(foodItemService.search(query), HttpStatus.OK);
    }
}
