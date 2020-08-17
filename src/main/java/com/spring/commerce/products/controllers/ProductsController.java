package com.spring.commerce.products.controllers;

import com.spring.commerce.products.entities.Product;
import com.spring.commerce.products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;

    @PostMapping(path = "/product")
    public void addProduct(@RequestBody Product product){
        System.out.println("Add new product");
        productsRepository.save(product);
    }

    @GetMapping(path = "/product/{productid}")
    @ResponseBody
    public Product getProduct(@PathVariable int productid){
        return productsRepository.findById(productid).get();//.stream().collect(Collectors.toList());
    }

    @GetMapping(path = "/product/list")
    public List<Product> getAllProducts(){
        return productsRepository.findAll();
    }
}
