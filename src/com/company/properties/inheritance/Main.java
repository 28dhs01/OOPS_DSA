package com.company.properties.inheritance;

public class Main {

    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(8) ;
        //box1.h = 10 ;
//        System.out.println(box1.h);

//        Box box = new Box (7,9,1) ;
//        Box boxx = new Box(box) ;
//        System.out.println(boxx.w);

//        BoxWeight box2 = new BoxWeight(3,4,5,10);
//        System.out.println(box2.h +" "+ box2.weight);
//        BoxWeight box3 = new BoxWeight(10,20) ;
//        System.out.println(box3.h +" "+ box3.weight +" "+ box3.h);

//        Box box4 = new BoxWeight () ;
//        System.out.println(box4.h); // this will work
//        System.out.println(box4.weight); // throws error since variables reference variable can access depends on the type of reference variable

        //BoxWeight box5 = new Box() ;
        // this will throw error
        // reference variable is of type child class and object is created of parent class
        // there are many variables in child and parent class
        // we can access only those variables which are of type ref variables
        // hence we can access the variables of BoxWeight class i.e. weight, h ,w , l since all these are inherited from Box class
        // this also means the variables which we can access should also be initialized
        // but the object is of type Box class and hence it does not know about the weight variable
        // hence error


//        BoxWeight box6 = new BoxWeight(7,10) ;
//        BoxWeight box7 = new BoxWeight(box6) ;
//        System.out.println(box7.h +" "+ box7.weight);

//        BoxPrice box8 = new BoxPrice(8,8,500);
//        System.out.println(box8.w+ " " + box8.weight+" "+ box8.price);

//        BoxColor box9 = new BoxColor();
//        System.out.println(box9.h +" "+ box9.color);
//
//        BoxColor box10 = new BoxColor(10,7,8,10,"red");
//        System.out.println(box10.weight+" "+ box10.color);


        // this is wrong way to use static methods
        // but used for better understanding that static methods can't be overridden
        Box box11 = new BoxWeight();
        box11.greeting();

        BoxWeight.greeting(); // you can inherit but you can't override



    }
}
