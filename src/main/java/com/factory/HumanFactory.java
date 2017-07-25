package com.factory;

/**
 * Created by qmm on 17-7-24.
 */


public class HumanFactory {

    //普通工厂模式
    //弊端：第一种如果传入的字符串有误，不能正确创建对象
    public Human createHuman(String gender){

        if(gender.equals("male")){
            return new Male();
        }else if(gender.equals("female")){
            return new Female();
        }else {
            System.out.println("请输入正确的类型！");
            return null;
        }

    }


    //多个工厂模式
//    public  Male createMale(){
//        return  new Male();
//    }
//
//    public Female createFemale(){
//        return new Female();
//    }


    //静态工厂模式
    //相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
    public  static Male createMale(){
        return new Male();
    }

    public static Female createFemale(){
        return new Female();
    }
}
