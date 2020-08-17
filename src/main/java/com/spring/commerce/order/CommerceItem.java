package com.spring.commerce.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "CommerceItem")
public class CommerceItem {
    @Id
    @GeneratedValue
    private int commerceItemId;
    private int productId;
    private String productName;
    private String productDescription;
    private double salePrice;
    private double discount;
    private String manufacturer;
}
