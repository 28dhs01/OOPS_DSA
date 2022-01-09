package com.company.properties.inheritance;

public class BoxWeight extends Box {
    int weight ;

    public BoxWeight(){
        this.weight = -1 ;

    }
    public BoxWeight(BoxWeight other){
        // same as :
        // Box box = new BoxWeight(3,5,7) ;
        super(other);
        this.weight = other.weight ;
    }

    public BoxWeight(int weight){
        this.weight = weight ;
    }

    public BoxWeight(int side, int weight) {
        super(side);
//        super.h  = 10 ;
        this.weight = weight;
    }

    public BoxWeight(double l, int w, int h, int weight) {
        super(l, w, h); // calls the constructor of parent class
        // if super constructor not used default constructor of super class will be called
        this.weight = weight;
    }

    // static methods can't be overridden
    //@Override
//    public static void greeting(){
//        System.out.println("hi i'm in BoxWeight class");
//    }
}
