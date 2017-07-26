package com.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qmm on 17-7-26.
 */
public class MethodReference {
    public static void main(String[] args){

        //List是一个接口,List有两个重要的实现类：ArrayList 和 LinkedList
        //ArrayList: 动态数组，能够自动增长容量的数组。
        List names = new ArrayList();

        //向数组中添加数据
        names.add("peter");
        names.add("Qmm");
        names.add("Linda");

        //通过System.out::println引用了输出的方法
        names.forEach(System.out::println);
    }
}
