package com.company.singleton;

import com.company.properties.encapsulation.accessModifiers.A;

// here i'm learning about access modifiers and not singleton
public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        // will work like this
//        Subclass obj = new Subclass(10,"Mohan");
//        int n = obj.num ;

        // won't work
        // why ? -> how would you expect A to know about what is its subclass
        //          its only subclass which knows who his parents are
        //          had this been working there will be no difference between protected and public
//        A obj = new A(7,"Alex");
//        int n = obj.num ;
    }
}
class Subclass2 extends A{
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(9,"Joe");
        int n = obj.num ;
    }
}
