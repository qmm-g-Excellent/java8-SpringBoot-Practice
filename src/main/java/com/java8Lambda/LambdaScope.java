package com.java8Lambda;

/**
 * Created by qmm on 17-7-26.
 */
public class LambdaScope {

    final static String value = "Hello"; //正确不可再次赋值
//    static String value = "Hello"; //正确，可再次赋值

//    final String value = "Hello";//报错！！！
//        String value = "Hello";//报错！！！

    interface GreetingService{
      void  sayMessage(String message);
    }

    public static void main(String[] args) {
//        final String value ="Hello  and ";//正确，不可再次赋值
//        String value = "Hello and hbc ";//正确，隐性为final，不可再次赋值

        GreetingService greetService = message -> System.out.println(value+ message);
        greetService.sayMessage("  Qmm!");
    }


}
