package com.company.properties.polymorphism;

public class Square extends Shapes{
    // run time polymorphism / dynamic polymorphism
    @Override
    void area(){
        System.out.println("area of square is side*side");
    }
}
