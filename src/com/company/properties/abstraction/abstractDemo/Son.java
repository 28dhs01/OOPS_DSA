package com.company.properties.abstraction.abstractDemo;

public class Son extends Parent {
    public Son() {
        super();
    }
    @Override
    void career(String profession) {
        System.out.println("I'm in Son class");
        System.out.println("I want to become "+ profession);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I want to marry to "+name+" and she is "+age +" years old");
    }
    void hobby(){
        System.out.println("I fancy reading books in free time");
    }

    @Override
    void normal() {
        super.normal();
    }
}
