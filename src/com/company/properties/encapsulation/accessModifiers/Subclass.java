package com.company.properties.encapsulation.accessModifiers;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(10,"Mohan");
        int n = obj.num ;

        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof Object);
        //System.out.println(obj instanceof ObjectDemo);
    }
}
