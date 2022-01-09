package com.company.properties.polymorphism;

public class Numbers {

    // compile time polymorphism - achieved with the help of method overloading
    int sum(int a, int b){
        return a+b ;
    }
    int sum (int a, int b, int c){
        return a+b+c ;
    }
    double sum ( double a, int b){
        return a+b;
    }
}
