package com.sparkjava.hw;

import com.google.gson.Gson;
import org.eclipse.jetty.webapp.CloneConfiguration;

import static spark.Spark.*;


public class Run {
    public static void main(String[] args) {
        //створюємо об'єкт репозиторію, який зберігає замовлення в пам'яті
        OrderRepository repository = new OrderRepository();

        //Об'єкт Gson потрібен для перетворення Java <-> JSON
        Gson gson = new Gson();

        //Роут:  Get /orders - отриматі всі замовлення
        get("/orders", (req, res) -> {
            res.type("application/json"); //тип відповіді: JSON
            return gson.toJson(repository.getAll()); //перетворюємо список замовлень у JSON
        });

        //отримати замовлення за id
        get("/orders/:id", (req, res) -> {
            res.type("application/json");
            Long id = Long.parseLong(req.params(":id"));
            Order order = repository.getById(id);
            if (order == null) {
                res.status(404);
                return "{\"error\":\"Order not found\"}"; // повертаємо помилку
            }
            return gson.toJson(order); //повертаємо знайдене замовлення у JSON
        });

        // POST /orders - додати нове замовлення
        post("orders", (req, res) -> {
            res.type("application/json");
            Order newOrder = gson.fromJson(req.body(), Order.class); //отримуємо замовлення з JSON тіла
            repository.add(newOrder); //додаємо до репозиторію
            res.status(201);
            return gson.toJson(newOrder); //повертаємо новк замовлення
        });

        // Роут: PUT /orders/:id — оновити існуюче замовлення
        put("/orders/:id", (req, res) -> {
            res.type("application/json");
            Long id = Long.parseLong(req.params(":id")); // Отримуємо id з URL
            Order updatedOrder = gson.fromJson(req.body(), Order.class); // Отримуємо нові дані замовлення
            if (repository.getById(id) == null) {
                res.status(404);
                return "{\"error\":\"Order not found\"}";
            }
            repository.add(updatedOrder); // Перезаписуємо замовлення
            return gson.toJson(updatedOrder); // Повертаємо оновлене замовлення
        });

        // Роут: DELETE /orders/:id — видалити замовлення за ID
        delete("/orders/:id", (req, res) -> {
            res.type("application/json");
            Long id = Long.parseLong(req.params(":id"));
            Order order = repository.getById(id);
            if (order == null) {
                res.status(404);
                return "{\"error\":\"Order not found\"}";
            }
            repository.remove(id); // Видаляємо замовлення
            return "{\"status\":\"Order deleted\"}";
        });
    }
}
