package com.justin.Lambda;

import java.time.*;
// 日期计算
public class DateTimeCalculation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);//Today's date: 2024-05-19

        // 加减日期
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next week: " + nextWeek);//Next week: 2024-05-26


        LocalDate previousMonthSameDay = today.minusMonths(1);
        //Previous month same day: 2024-04-19
        System.out.println("Previous month same day: " + previousMonthSameDay);

        // 加减时间
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);//Current time: 23:45:34.543283100

        LocalTime inTwoHours = now.plusHours(2);
        System.out.println("In two hours: " + inTwoHours);//In two hours: 01:45:34.543283100

        LocalTime thirtyMinutesAgo = now.minusMinutes(30);
        System.out.println("Thirty minutes ago: " + thirtyMinutesAgo);//Thirty minutes ago: 23:15:34.543283100
    }
}