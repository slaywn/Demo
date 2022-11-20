package com.example.demo.SpringBoot.entity;

public class Token {
    public static String token = "1";

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        Token.token = token;
    }
}
