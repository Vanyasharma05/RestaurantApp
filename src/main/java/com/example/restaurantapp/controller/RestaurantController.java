package com.example.restaurantapp.controller;

import com.example.restaurantapp.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        // Simulated list of restaurants
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1L, "Tasty Bites", "123 Food St.", "Italian"));
        restaurants.add(new Restaurant(2L, "Spicy Villa", "456 Spice Ave.", "Indian"));
        restaurants.add(new Restaurant(3L, "Sushi World", "789 Sushi Ln.", "Japanese"));

        return restaurants;
    }
}
