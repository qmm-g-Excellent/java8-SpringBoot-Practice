package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationApi {
    public static void main(String args[]) {
        PeriodAndDurationApi tester = new PeriodAndDurationApi();
        tester.showPeriod();
        tester.showDuration();
    }

    public void showPeriod() {

        //或得当前的时间
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        // 在当前日期的基础上增加一个月时间
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        // 用between方法计算两个日期直接的间隔（称之为Period）
        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    public void showDuration() {

        LocalTime time1 = LocalTime.now();
        System.out.println("Current time: " + time1);

        Duration fiveHours = Duration.ofHours(5);
        System.out.println("fiveHours: " + fiveHours);

        LocalTime time2 = time1.plus(fiveHours);
        System.out.println("next 5 time: " + time2);

        // 对应的，用between方法显示两个时间直接的间隔（称之为Duration）
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration: " + duration);
    }
}
