package com.company.properties.encapsulation.accessModifiers;

public class A {
    // private num can only be accessed in this class
    // that's why i had to create getters and setters
    // public num can be accessed from anywhere any package any class
    // protected num can be accessed from subclass in other packages too but only in subclass of other package
    // default num can be accessed in subclass in same package only

    protected int num ;
    String name ;
    int[]arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num] ;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
