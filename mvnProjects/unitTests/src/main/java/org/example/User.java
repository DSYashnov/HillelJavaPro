package org.example;

import lombok.Builder;


public class User {
    private String name;
    private Integer age;
    private String email;
    private String phone;

    public User(String name, Integer age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public User setName(String name) { // Змінили тип повернення на User
        this.name = name;
        return this; // Повертаємо поточний об'єкт
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) { // Змінили тип повернення на User
        this.email = email;
        return this; // Повертаємо поточний об'єкт
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) { // Змінили тип повернення на User
        this.age = age;
        return this; // Повертаємо поточний об'єкт
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) { // Змінили тип повернення на User
        this.phone = phone;
        return this; // Повертаємо поточний об'єкт
    }
}

