package com.company.properties.abstraction.interfaces.extendDemo;

public class C implements B{
    // it needs to have both the methods of B and its parent interface
    @Override
    public void fun() {
        System.out.println("I have overridden A class method");
    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        // using the static method of A interface
        A.greeting();
    }
}
