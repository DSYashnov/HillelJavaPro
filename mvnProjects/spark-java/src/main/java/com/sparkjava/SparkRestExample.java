package com.sparkjava;


import com.google.gson.Gson;

import java.security.UnrecoverableEntryException;
import java.util.UUID;

import static spark.Spark.*;


public class SparkRestExample {
    public static void main(String[] args) {
        final UserService userService = new UserServiceMapImpl();

        //http://localhost:4567/users
        //create new user in system
        post("/users", (request, response) -> {
            response.type("application/json");

            User user = new Gson().fromJson(request.body(), User.class);
            user.setId(UUID.randomUUID().toString());
            userService.addUser(user);

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        });
        //get users
        get("/users", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(userService.getUsers())));
        });
        //get user by id
        get("/users", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(userService.getUser(request.params(":id")))));
        });

        //user update
        put("/users", (request, response) -> {
            response.type("application/json");

            User toEdit = new Gson().fromJson(request.body(), User.class);
            String id = request.params(":id");
            toEdit.setId(id);
            User editeUser = userService.editUser(toEdit);

            if (editeUser != null) {
                return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(editeUser)));
            } else {
                return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJson("User not found or error in edit")));
            }
        });

        //delete user
        delete("/users", (request, response) -> {
            response.type("application/json");

            userService.deleteUser(request.params(":id"));
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, "user deleted"));
        });

        //check user availability
        options("/users", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, (userService.userExist(request.params(":id"))) ? "User exist" : " "));
        });
    }
}
