package com.java8.defaultMethod;

/**
 * Created by qmm on 17-7-26.
 */
public interface Learner {
    default void print(){
        System.out.println("I am a learner");
    }
}
