package com.company.enums;

public class Basic {

    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        // the above are enum constants
        // these properties are by default public , static and final
        // since it is final child classes can't be made
        // enum itself extends to its parent class so it can't inherit other class (multiple inheritance)
        // but it can implement other interfaces

        Week(){
            System.out.println(" I'm constructor "+this+ " enum");
        }

        // abstract void sing(); // As enums don't have child classes abstract methods not allowed
        // however normal methods are allowed
        void sing(){
            System.out.println("la la la");
        }

        @Override
        public void greet() {
            System.out.println("hey, morning Dhruv !");
        }
    }

    public static void main(String[] args) {

//        System.out.println(Week.Friday);
//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
        Week day2 = Week.Tuesday;
        System.out.println(day2.ordinal());

        day2.greet();
    }
}
