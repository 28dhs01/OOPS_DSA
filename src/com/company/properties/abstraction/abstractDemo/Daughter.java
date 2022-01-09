package com.company.properties.abstraction.abstractDemo;

public class Daughter extends Parent {


    @Override
    void career(String profession) {
        System.out.println("I'm in Daughter class");
        System.out.println("I want to become "+ profession);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I'm in Daughter class");
        System.out.println("I want to marry to "+name+" and he is "+age +" years old");
    }
}
