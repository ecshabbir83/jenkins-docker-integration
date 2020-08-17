package com.spring.commerce.cart.service;

import com.spring.commerce.products.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cart {
    private List<Product> productList;
    private double totalPrice;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addToCart(Product product) {
        productList.add(product);
    }
}
