package com.company.singleton;

public class Singleton {
    // our aim is to create one obj of this class only

    private Singleton() {
        System.out.println("hi i'm the only instance");
    }
    static Singleton instance ;
    public static Singleton getInstance(){
        // if instance is not created create it
        if(instance == null ){
            instance = new Singleton() ;
        }
        return instance ;
    }
}
