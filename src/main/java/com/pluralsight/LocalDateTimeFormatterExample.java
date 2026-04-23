package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterExample {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);
        // Specify the date/time format you will want to use
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today.format(formatter);
        System.out.println("Today is: " + formattedDate);
    }

}
