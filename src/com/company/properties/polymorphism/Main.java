package com.company.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape = new Shapes() ;
//        Triangle triangle1 = new Triangle() ;

//        Shapes square = new Square() ; // here overriding will come into picture
                                         // we have 2 similar definitions methods in parent and child class
                                        // which one to access - with the help of overriding that determines to use
                                        // same one as that of object
                                        // Java gets it by Dynamic method dispatchers
//        shape.area();
//        triangle1.area();
//        square.area();

        Numbers obj = new Numbers();
        System.out.println(obj.sum(3,4));
        System.out.println(obj.sum(2,4,6));

    }
}
