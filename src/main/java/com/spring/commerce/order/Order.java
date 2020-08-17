package com.spring.commerce.order;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Order")
public class Order {
    @Id
    @GeneratedValue
    private long orderId;

    @OneToMany(mappedBy = "commerceItemId")
    @OrderBy
    private List<CommerceItem> commerceItemList;

    private double orderTotal;

    private double orderDiscount;

    private enum orderState{

    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<CommerceItem> getCommerceItemList() {
        return commerceItemList;
    }

    public void setCommerceItemList(List<CommerceItem> commerceItemList) {
        this.commerceItemList = commerceItemList;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }
}
