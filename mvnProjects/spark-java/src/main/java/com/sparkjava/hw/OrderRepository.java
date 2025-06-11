package com.sparkjava.hw;


import java.time.LocalDate;
import java.util.*;

public class OrderRepository {
    private final Map<Long, Order> orders = new HashMap<>(); //HashMap для зберігання замовлень за id

    public OrderRepository(){
        //ініціалізуємо тестове замовлення
            Product p1 = new Product(1L, "Ноутбук", 1500.0);
            Product p2 = new Product(2L, "Мишка", 25.0);
            Order order = new Order(100L, "2025-06-11", p1.getCost() + p2.getCost(), Arrays.asList(p1, p2));
            orders.put(order.getId(), order);
        }

    public Order getById(Long id) {
        return orders.get(id);
    }
    public List<Order> getAll(){
        return new ArrayList<>(orders.values());
    }
    public void add (Order order){
        orders.put(order.getId(), order);
    }
    public void remove(Long id) {
        orders.remove(id);
    }
}
