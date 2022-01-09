package com.company.staticEg;

//class Test {
//    static String name ;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//}

//outer classes are never static
public class InnerClasses {

    // inner classes can be or can't be static
    static class Test {
         String name ;

        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return this.name ;
        }
    }


    public static void main(String[] args) {

        // I have to make Test class as a static because it is dependent on inner class
        // had it been independent class I don't need to make it static
        Test a = new Test("Dhruv") ; // here i am not making the instances of outer class i.e InnerClass
        Test b =  new Test ("Raj");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}
