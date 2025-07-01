package com.sparkjava;

import jdk.jshell.spi.ExecutionControl;

import java.util.Collection;
import java.util.Collections;

public interface UserService {
    void addUser(User user);

    Collection<User> getUsers();

    User getUser (String id);

    User editUser (User user) throws UserException;

    void deleteUser(String id);

    boolean userExist(String id);
}
