package com.java8.LocalDateTime;

/**
 * Created by qmm on 17-7-27.
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

//为了保持向后兼容的能力，原始的Date和Calendar对象添加了一个toInstant方法。
// 该方法可以将其转换为新API下的对象。当然，还可以用ofInstant方法来获得LocalDateTime和ZonedDataTime对象。

public class toInstantApi {
    public static void main(String args[]) {
        toInstantApi tester = new toInstantApi();
        tester.applyBackwarCompatability();
    }

    public void applyBackwarCompatability() {
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);//Current date: Thu Jul 27 17:47:03 CST 2017

        // 获得当前日期的实例（以毫秒的形式）
        Instant now = currentDate.toInstant();
        System.out.println("now: " + now);


        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("currentZone: " + currentZone); //currentZone: Asia/Shanghai

        // 用ofInstant方法获得实例
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);//Local date: 2017-07-27T17:47:03.456

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);//Zoned date: 2017-07-27T17:47:03.456+08:00[Asia/Shanghai]

    }
}
