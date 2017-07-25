package com.factory;

/**
 * Created by qmm on 17-7-24.
 */
public class FactoryMain {

    //普通工厂模式
//    public static void main(String[] args){
//        HumanFactory factory = new HumanFactory();
//        Human male  = factory.createHuman("male");
//        male.eat();
//        male.sleep();
//        male.beat();
//    }


    //多个工厂模式
//    public static void main(String[] args){
//        HumanFactory factory = new HumanFactory();
//        Human male =  factory.createMale();
//        male.eat();
//        male.sleep();
//        male.beat();
//    }



    //静态工厂模式
    public static void main(String[] args) {
      Human female= HumanFactory.createFemale();
        female.eat();
        female.sleep();
        female.beat();

    }
}
