package com.java8;

/**
 * Created by qmm on 17-7-26.
 */
import  java.util.Optional;

public class OptionalExample {

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // isPresent() 用于检查值是否存在
        System.out.println("First parameter is present  " + a.isPresent());
        System.out.println("second parameter is present  " + b.isPresent());

        //如果Optional实例有值则将其返回，否则返回 orElse() 方法传入的参数
        Integer value1 = a.orElse(new Integer(0));

        //如果Optional有值则将其返回，否则抛出NoSuchElementException。
        Integer value2 = b.get();

        return value1 + value2;
    }


    public static void main(String args[]){

        OptionalExample tester = new OptionalExample();
        
        Integer value1 = null;
        Integer value2 = new Integer(5);

        //指定的值创建一个Optional，ofNullable 允许传参给出 null,如果指定的值为null，则返回一个空的Optional,
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.ofNullable(value2);

        System.out.println(tester.sum(a,b));
    }

}
