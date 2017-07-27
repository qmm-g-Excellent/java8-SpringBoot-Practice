package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {

    public static void main(String args[]) {
        TemporalAdjuster tester = new TemporalAdjuster();
        tester.applyAdjusters();
    }


    public void applyAdjusters() {
        LocalDate date1 = LocalDate.now();
        System.out.println("current date: " + date1);

        // 计算下周一的日期并输出
        LocalDate nextMonday = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("next monday on : " + nextMonday);

        // 获得下个月的第二个周天的日期并输出
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println(" next month : " + date2);

        LocalDate firstInMonth = LocalDate.of(date2.getYear(), date2.getMonth(), 1);
        System.out.println("firstInMonth : " + firstInMonth);

        LocalDate secondSunday = firstInMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("second sunday of next month : " + secondSunday);
    }
}
