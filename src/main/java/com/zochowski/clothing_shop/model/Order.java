package com.zochowski.clothing_shop.model;

import java.util.Date;
import java.util.Map;

public class Order {
    private Long id;
    private Date orderDate;
    private Map<Long, Map<Product, Integer>> orderDetails;
    private String state;
}
