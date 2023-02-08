package com.foodbox.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.food.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
