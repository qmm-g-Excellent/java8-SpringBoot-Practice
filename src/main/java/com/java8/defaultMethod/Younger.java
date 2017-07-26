package com.java8.defaultMethod;

/**
 * Created by qmm on 17-7-26.
 */
public interface Younger {
    default void print(){
        System.out.println("I am a younger");
    }

    static void sayHi(){
        System.out.println("Younger is a capital");
    }

}
