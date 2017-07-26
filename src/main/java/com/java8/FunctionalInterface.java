package com.java8;

/**
 * Created by qmm on 17-7-26.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String args[]) {

        //将一个数组转化为一个List对象，这个方法会返回一个ArrayList类型的对象
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("All of the number!");
        eval(list, n -> true);

        System.out.println("Even number!");
        eval(list, n -> n % 2 == 0);

        System.out.println("Number that greater than 5!");
        eval(list, n -> n > 5);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }
}
