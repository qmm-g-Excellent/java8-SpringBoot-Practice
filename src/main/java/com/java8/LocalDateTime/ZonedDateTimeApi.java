package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApi {

    public static void main(String args[]) {
        ZonedDateTimeApi tester = new ZonedDateTimeApi();
        tester.testZonedDateTime();
    }

    public void testZonedDateTime() {

        // 将字符串代表的时区信息转化
        ZonedDateTime date1 = ZonedDateTime.parse("2016-04-20T19:22:15+01:30[Europe/Paris]");
        System.out.println("date1: " + date1);

        // 设定地区ID为亚洲的加尔各答（位于印度），并输出
        ZoneId id = ZoneId.of("Asia/Kolkata");
        System.out.println("ZoneId: " + id);

        // 获得系统默认的当前地区并输出
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }

}
