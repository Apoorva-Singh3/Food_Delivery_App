package com.foodbox.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
