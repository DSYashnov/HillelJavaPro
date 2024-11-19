package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println(args[0]);
        }
        System.out.println("Hello world!" + LocalDateTime.now());
//
//        User user = new User (1, "Stanislav", "mail@gmail.com");
//        System.out.println(user);
//
//        System.out.println(RandomStringUtils.randomAlphabetic(10));

    }
}