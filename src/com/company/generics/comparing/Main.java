package com.company.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student dhruv = new Student(90.0f,14);
        Student sukrit = new Student(94.2f,40);
        Student akhil = new Student(91.4f,3);
        Student ravindu = new Student(84.2f,37);

//        if( dhruv.compareTo(sukrit) < 0 ){
//            // these are thoughts of narrow thinking
//            // even if it is in my favour still I would say this thing
//            // because everyone is a genius in himself
//            System.out.println(dhruv.compareTo(sukrit));
//            System.out.println("sukrit is more intelligent than dhruv");
//        }

        Student [] list = {dhruv,sukrit,akhil,ravindu};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
