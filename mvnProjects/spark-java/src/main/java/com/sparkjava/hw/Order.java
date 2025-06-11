package com.sparkjava.hw;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;


@ToString
public class Order {
    private Long id;                    //ідентифікатор замовлення
    private String date;             //дата створення замовлення
    private double cost;                //загальна вартість замовлення
    private List<Product> productList;  //список продуктів у замовленні

    //конструктор для ініціалізіції всіх полів замовлення

    public Order(Long id, String date, double cost, List<Product> productList) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

