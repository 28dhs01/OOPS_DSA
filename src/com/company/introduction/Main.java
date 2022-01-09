package com.company.introduction;

import com.company.introduction.Student;

import static com.company.packages.b.Message.message;

public class Main {

    public static void main(String[] args) {
        // teacher asks you to store 5 students name
        String[] studentsName = new String[5];
        // teacher praises you and asks you to store 5 roll no's
        int[] rno = new int[5];
        // again good job now store student with roll no and their marks
//        String[] studentsName = new String [5];
//        int [] rno = new int[5] ;
//        int [] marks  = new int [5] ;
        // above method is inefficient and how will you distinguish which student has what roll no and how many marks
        // hence come classes and objects

//        Student [] students = new Student[5] ; // students is a reference variable
//        System.out.println(students);
//        System.out.println(Arrays.toString(students));

//        Student student ; // declaration
//        Student students = new Student() ; // instantiation
//
//        Student student1 = new Student() ;
//        student1.name = "Dhruv" ;
//        System.out.println(student1.name);
        //System.out.println(student1.marks);
        //System.out.println(student1.name);

//        Student  student1 = new Student("Dhruv", 90.00F,18);
//        System.out.println(student1.name);
//
//        Student student2 = new Student();
//        System.out.println(student2.rno);


        // final keyword
//        final int  AGE = 10 ;
//        AGE = 14 ;


        // normally we don't make objects of primitives but we can make them as below
        // Wrapper classes
//        Integer a = new Integer(10) ;
//        a.toString() ;
//        Integer b = new Integer(20) ;
//        swap( a, b );
//        System.out.println(a +" "+ b); // since Integer is a final class so it can't swap

        Student student1;
        for (int i = 0; i < 1000000; i++) {
            student1 = new Student();
        }

    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
