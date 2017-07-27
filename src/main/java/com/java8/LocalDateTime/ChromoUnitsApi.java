package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChromoUnitsApi {
    public static void main(String args[]) {
        ChromoUnitsApi tester = new ChromoUnitsApi();
        tester.testChromoUnits();
    }

    public void testChromoUnits(){

        // 获得当前的日期并输出
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        // 在当前日期的基础上增加两周时间再输出
        LocalDate nextWeek = today.plus(2,ChronoUnit.WEEKS);
        System.out.println("two weeks after now: " + nextWeek);

        // 在当前日期的基础上增加6个月的时间再输出
        LocalDate nextMonth = today.plus(6,ChronoUnit.MONTHS);
        System.out.println("6 months after now: " + nextMonth);

        // 在当前日期的基础上增加5年的时间再输出
        LocalDate nextYear = today.plus(5,ChronoUnit.YEARS);
        System.out.println("5 years after now: " + nextYear);

        // 在当前日期的基础上增加20年的时间再输出（一个Decade为10年）
        LocalDate nextDecade = today.plus(2,ChronoUnit.DECADES);
        System.out.println("20 years after now: " + nextDecade);
    }

}
