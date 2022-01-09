package com.company.staticEg;

public class StaticBlock {
    static int a = 5 ;
    static int b;

    // will run only once when the first obj is created
    static{
        System.out.println("I am in static block");
        b = a*4 ;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a +" " + StaticBlock.b);

        StaticBlock obj = new StaticBlock() ;
        System.out.println(StaticBlock.a +" " + StaticBlock.b);
        StaticBlock.b += 3 ;
        StaticBlock obj2 = new StaticBlock() ;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
