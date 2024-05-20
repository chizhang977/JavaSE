package com.justin.Lambda;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatParse {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化日期时间
        String formattedDateTime = dateTime.format(formatter);
        //Formatted date and time: 2024-05-19 23:49:39
        System.out.println("Formatted date and time: " + formattedDateTime);

        // 解析日期时间
        String dateTimeString = "2024-05-19 14:30:15";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        //Parsed date and time: 2024-05-19T14:30:15
        System.out.println("Parsed date and time: " + parsedDateTime);
    }
}
