package com.sparkjava;

import com.google.gson.JsonElement;

public class StandardResponse {

    private StatusResponse status;
    private String message;
    private JsonElement data;

    // Конструктор для відповіді тільки зі статусом
    public StandardResponse(StatusResponse status) {
        this.status = status;
    }

    // Конструктор для відповіді з повідомленням
    public StandardResponse(StatusResponse status, String message) {
        this.status = status;
        this.message = message;
    }

    // Конструктор для відповіді з даними
    public StandardResponse(StatusResponse status, JsonElement data) {
        this.status = status;
        this.data = data;
    }

    // Геттери
    public StatusResponse getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public JsonElement getData() {
        return data;
    }
}
