package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeApi {
    public static void main(String args[]) {
        LocalDateTimeApi tester = new LocalDateTimeApi();
        tester.testLocalDateTime();
    }

    public void testLocalDateTime() {

        //获取当前的日期和时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Date and Time：　" + currentTime);

        // 输出当前时间的本地值（本时区）
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("local date:　" + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        // 由当前时间对象获得各个字段，输出结果
        System.out.println("month: " + month + "　day: " + day + "　seconds: " + seconds);

        // 由当前时间附带月份和年再输出
        java.time.LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date 2: " + date2);

        // 输出2016年圣诞节的日期
        LocalDate date3 = LocalDate.of(2016, Month.DECEMBER, 25);
        System.out.println("date 3: " + date3);

        // 输出新闻联播的开始时间
        LocalTime date4 = LocalTime.of(19, 00);
        System.out.println("date 4: " + date4);

        // 转化为字符串，再输出
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date 5: " + date5);
    }
}
