package com.company.properties.polymorphism;

public class ObjectPrint {
    int num ;

    public ObjectPrint(int num) {
        this.num = num ;
    }

    // run time polymorphism
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(23);
        System.out.println(obj);
    }

}
