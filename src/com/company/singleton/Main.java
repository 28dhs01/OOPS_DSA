package com.company.singleton;


import com.company.properties.encapsulation.accessModifiers.A;

public class Main{

    public static void main(String[] args) {
//        Singleton obj = Singleton.getInstance() ;
//        Singleton obj2 = Singleton.getInstance() ;
//        Singleton obj3 = Singleton.getInstance() ;

        // all ref variables are pointing to single obj


        // here i'm learning about access modifiers and from now onwards the below code won't deal with singleton
        A obj = new A(10,"Rahul");
       // int n = obj.num;

    }
}
