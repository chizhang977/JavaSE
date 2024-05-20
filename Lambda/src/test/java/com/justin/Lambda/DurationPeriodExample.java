package com.justin.Lambda;

import java.time.*;
//时间段
public class DurationPeriodExample {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(14, 0);
        LocalTime endTime = LocalTime.of(16, 30);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration);//Duration: PT2H30M

        LocalDate startDate = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2021, Month.JANUARY, 1);

        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);//Period: P1Y
    }
}
