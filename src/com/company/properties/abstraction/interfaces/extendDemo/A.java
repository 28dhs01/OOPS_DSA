package com.company.properties.abstraction.interfaces.extendDemo;

public interface A {

    // better to use abstract methods only
    default void fun(){
        System.out.println("I am default fun in interface");
    }
    // lets check about static methods
    // cannot be abstract by default
    // why? -> I can't override static methods
    // static void greeting(); // hence it will throw compile time error

    // but we can use static methods with their body in interfaces
    static void greeting(){
        System.out.println("hello I am static method in interface and I'm not abstract. I have my own body");
    }

}
