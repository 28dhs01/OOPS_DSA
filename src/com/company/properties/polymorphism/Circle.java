package com.company.properties.polymorphism;

public class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("area of circle is pi*r*r");
    }
}
