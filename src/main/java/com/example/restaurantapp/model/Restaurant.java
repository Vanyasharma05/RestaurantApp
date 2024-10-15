package com.example.restaurantapp.model;

public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private String cuisine;

    // Constructors
    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address, String cuisine) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cuisine = cuisine;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}


