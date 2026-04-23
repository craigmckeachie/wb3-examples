package com.pluralsight;

import java.time.LocalDateTime;

public class LocalDateApp {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.toString());
    }
}
