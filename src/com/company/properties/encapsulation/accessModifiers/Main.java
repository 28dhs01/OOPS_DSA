package com.company.properties.encapsulation.accessModifiers;

import java.util.ArrayList;
// different types of packages are there
// above one is util package which contains dataStructures and all
// ArrayList<> in our case

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList();
//        list.DEFAULT_CAPACITY;
//        A obj = new A(5,"Dhruv") ;
//        // access the private data of A class
//        System.out.println(obj.getNum());
//
//        // can access the default type in same package anywhere
//        int n = obj.num ;

//        ObjectDemo obj = new ObjectDemo(7);
//        ObjectDemo obj2 = new ObjectDemo(7);
//        ObjectDemo obj3 = obj2 ;
//       // System.out.println(obj.toString());
//
//        // hashcode is not address . It is a random number
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

        ObjectDemo obj = new ObjectDemo(7, "Raj"); // creating a new obj
//        ObjectDemo obj2 = new ObjectDemo(7,"Alex"); // creating a new obj
//        ObjectDemo obj3 = obj2 ; // obj3 is referring to same object obj2
//        if(obj == obj2){
//            System.out.println("==");
//        }
//        else if( obj.equals(obj2)){
//            System.out.println(".equals");
//        }
//        else {
//            System.out.println("nothing");
//        }

        System.out.println(obj.getClass());



    }
}
