package com.spring.commerce.cart.controllers;

import com.spring.commerce.cart.service.Cart;
import com.spring.commerce.products.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartModifierController {

    @Autowired
    Cart cart;

    @PostMapping
    public void addToCart(@RequestBody Product product){
        cart.addToCart(product);
    }


}
