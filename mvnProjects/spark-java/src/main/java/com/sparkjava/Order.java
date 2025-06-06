package com.sparkjava;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Order {
    private UUID uuid;
    private Timestamp createAt;
    private Timestamp updateAt;
    private double cost;
    //private List<Product> productList = new ArrayList<>();
}
