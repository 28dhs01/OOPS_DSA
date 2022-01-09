package com.company.properties.abstraction.abstractDemo;

public abstract class Parent {
    boolean isMarried;
    final int VALUE = 3829193;

    public Parent(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public Parent(){
        this.isMarried = false ;
    }
    abstract void career(String profession);
    abstract void partner(String name, int age);

    void normal(){
        System.out.println("I am normal method in parent class");
    }
    static void greetings(){
        System.out.println("hey, i'm parent class");
    }

}
