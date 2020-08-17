package com.spring.commerce.cart.service;

import com.spring.commerce.products.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingCalculator {

    public double repriceOrder(List<Product> products){
        double totalPrice = 0.0;

        totalPrice = products.stream().mapToDouble(x -> x.getPrice()).sum();
        return totalPrice;
    }
}
