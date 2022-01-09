package com.company.properties.abstraction.interfaces.mainExample;

public class Main {
    public static void main(String[] args) {
        // lets create a car
        // Engine engine = new Engine(); // wont execute since it contains abstract methods
//        Car car1 = new Car();
//        car1.start();
//        Engine car2 = new Car();
//        car2.stop();
//        //car2.applyBrake(); compile time error since the type of reference variable doesn't contain applyBrake method

//        MusicSystem car3 = new Car();
//        car3.stop(); // here it will run but the ambiguity is that I wish to stop the music system and my car engine is stopping
//        //car3.changeEngine(); // wont run
//        // to solve the above ambiguities I have to create separate classes in same interface

        NiceCar car = new NiceCar();
        car.startEngine();
        car.stopMusic();
        car.upgradeEngine(new ElectricEngine());
        car.startEngine();

    }
}
