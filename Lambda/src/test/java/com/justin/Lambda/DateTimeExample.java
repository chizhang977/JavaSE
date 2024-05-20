package com.justin.Lambda;

import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        // 创建当前日期对象
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);//Today's date: 2024-05-19

        // 创建特定日期对象
        LocalDate specificDate = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println("Specific date: " + specificDate);// 2020-01-01

        // 创建当前时间对象
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);// 23:35:45.851272400

        // 创建特定时间对象
        LocalTime specificTime = LocalTime.of(14, 30, 15);
        System.out.println("Specific time: " + specificTime);// 14:30:15

        // 创建当前日期时间对象
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);// 2024-05-19T23:35:45.851272400

        // 创建特定日期时间对象
        LocalDateTime specificDateTime = LocalDateTime.of(2020, Month.JANUARY, 1, 14, 30, 15);
        System.out.println("Specific date and time: " + specificDateTime);//2020-01-01T14:30:15

        // 创建当前带时区的日期时间对象
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        //2024-05-19T23:35:45.855817300+08:00[Asia/Shanghai]
        System.out.println("Current date and time with zone: " + currentZonedDateTime);

        // 创建特定时区的日期时间对象
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2020, 1, 1, 14, 30, 15, 0, ZoneId.of("Europe/Paris"));
        //2020-01-01T14:30:15+01:00[Europe/Paris]
        System.out.println("Specific date and time with zone: " + specificZonedDateTime);

        // 创建时间戳
        Instant timestamp = Instant.now();
        //2024-05-19T15:35:45.863394600Z
        System.out.println("Current timestamp: " + timestamp);
    }
}
