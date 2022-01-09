package com.company.introduction;

class Student {

    // instance variables
    String name ;
    int rno ;
    float marks ;

    // empty constructor
    Student(){
        this.name = "No name";
        this.marks = 100 ;
        this.rno = 0 ;
    }
    // constructor with parameters
    Student(String name, float marks, int rno){
        this.name = name ;
        this.marks = marks;
        this.rno = rno ;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object is destroyed");
    }
}
