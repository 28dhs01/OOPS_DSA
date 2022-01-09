package com.company.properties.inheritance;

// if this class is final
// child class cant inherit it
public class Box {
    private double l ;
    int w ;
    int h ;

    public Box(double l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(){
        super();
        this.l = -1 ;
        this.h = -1;
        this.w = -1 ;
    }
    // this constructor will be for cube box
    public Box(int side){
        this.l = side ;
        this.h = side ;
        this.w = side ;
    }
    public Box (Box old){
        this.h = old.h;
        this.l = old.l ;
        this.w = old.w ;
    }

    // static methods can't be overridden
    // static - object independent      overriding - object dependent
    public static void greeting(){
        System.out.println("hi i m in Box class");
    }


}
