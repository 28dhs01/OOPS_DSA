package com.company.staticEg;

public class Main {
      public static void main(String[] args) {
//        Human dhruv = new Human(21,100000,"Dhruv Sharma",false);
//        Human rahul = new Human(32,19999,"Rahul Rana",true);
//
//        System.out.println(Human.population);
//        Human Alex = new Human(23,1099,"Alex Chai",false);
//        System.out.println(Human.population);

          Main funn = new Main() ;
          funn.fun2();

          fun();


    }

    // you cant access the non static method inside static one
    static void fun(){

        System.out.println("I am in fun method");

        //greeting(); // the fun we are trying to call needs obj but
                        // the fun in which we are doesn't need obj


        // since I can't access the non-static method inside static one
        // hence I have to either declare greeting method as static
        // or create the instance of it in static method
        Main obj = new Main();
        obj.greeting();


    }
    void fun2(){
          // since this is non-static by itself
        // hence it will form its obj before coming to use
        // hence it can call the non-static greeting method
          greeting();
    }
    void greeting(){
        System.out.println("hello g");
    }
}
