package com.sparkjava.hw;

public class Product {
    private Long id; // унікальний ідентифікатор товару
    private String name; // назва товару
    private double cost; // вартісь товару

    //конструктор класу: приймає id, name and cost і ініціалізує поля

    public Product(Long id, String name, double cost) {
        this.id = id; //присвоюємо аргумент id полю класу
        this.name = name; //присвоюємо аргумент name полю класу
        this.cost = cost; //присвоюємо аргумент cost полю класу
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
