package com.company.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human student1 = new Human("Dhruv",21);
        // when i make the clone in this way it is bit slower and also it requires more code internally
        // check Student class
        Human clone = new Human(student1) ;
        System.out.println(clone.name);
        // I can make the use of Cloneable interface with clone() method

        // This clone is made quickly and even it has less code
        Human clone2 = (Human) student1.clone();
        System.out.println(clone2.name);
        System.out.println(Arrays.toString(student1.arr));
        clone2.arr[0] = 10 ;
        System.out.println(Arrays.toString(clone2.arr));
        System.out.println(Arrays.toString(student1.arr));


    }
}
