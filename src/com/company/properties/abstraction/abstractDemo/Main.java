package com.company.properties.abstraction.abstractDemo;

public class Main {
    public static void main(String[] args) {
//         Parent obj = new Parent(); // objects of abstract classes can't be made
//        Parent.greetings(); // since greeting is static in Parent class , I can call it directly with Class

//        Son son = new Son();
//        son.career("Coder");
//        son.hobby();
//        Daughter daughter = new Daughter();
//        daughter.partner("Joe",28);
        Parent obj = new Son();
        System.out.println(obj.isMarried);
        obj.partner("Lisa",27);

        // But still we can't solve the problem of multiple inheritance with abstraction
        // For that to resolve we need inheritance
    }
}
