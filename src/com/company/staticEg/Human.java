package com.company.staticEg;

public class Human {
    int age ;
    int salary ;
    String name ;
    static int population ;
    boolean isMarried ;

    public Human(int age, int salary, String name, boolean isMarried) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.isMarried = isMarried;
        Human.population += 1;
    }

}
