package com.java8Lambda;

/**
 * Created by qmm on 17-7-25.
 */
public class Lambda {

    //注意：在一个类中是可以定义接口的
    interface GreetingService {
        void sayMessage(String message);
    }

    interface MathOperation {
        int operation(int a, int b);//这里接口中定义的方法，似乎看起来没有在哪里去实现
    }

    //注意：方法要定义在main()方法外
    private int operate(int a, int b, MathOperation mathoperation) {
        return mathoperation.operation(a, b);//注意这里可以直接调用接口中定义的方法
    }

    public static void main(String[] args) {

        Lambda tester = new Lambda();//实例化本类的实例


        //实际上，我的理解是，以下四种方法可以看作：均是对接口 MathOperation　接口中的　operation()方法的实现！！！

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //without type declaration
        MathOperation subtraction = (a, b) -> a - b;

        // 带有大括号、带有返回语句的表达式
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号和return语句的表达式
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5=" + tester.operate(10, 5, addition));
        System.out.println("10-5=" + tester.operate(10, 5, subtraction));
        System.out.println("10*5=" + tester.operate(10, 5, multiplication));
        System.out.println("10/5=" + tester.operate(10, 5, division));

        //没有括号的表达式(类似于js中定义箭头函数的方式)
        GreetingService greetService1 = message -> System.out.println("Hello" + message);

        //有括号的表达式
        GreetingService greetService2 = (message) -> System.out.println("Hello" + message);

        // 调用sayMessage方法输出结果
        greetService1.sayMessage("shiyanlou");
        greetService2.sayMessage("Qmmhao");

    }
}
