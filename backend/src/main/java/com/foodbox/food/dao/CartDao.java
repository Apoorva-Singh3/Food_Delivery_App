package com.foodbox.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.food.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
