package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EcommerceApplication {
     @Autowired
    MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @PostConstruct
    public void testConnection() {
        System.out.println("DB Name: " + mongoTemplate.getDb().getName());
    }
}