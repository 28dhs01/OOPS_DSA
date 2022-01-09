package com.company.cloning;

public class Human implements Cloneable{
    String name ;
    int age ;
    int []arr ;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4};
    }
    public Human(Human other){
        this.name = other.name ;
        this.age = other.age ;
    }
//    public Object clone() throws CloneNotSupportedException {
//        // this is shallow copying
//        return super.clone() ;
//    }
        public Object clone() throws CloneNotSupportedException {
            // this is deep copying
            Human clone = (Human) super.clone(); // this is actually shallow copying
            // now we will create deep copy
            clone.arr = new int[clone.arr.length];
            for (int i = 0; i < clone.arr.length; i++) {
                clone.arr[i] = this.arr[i];
            }
            return clone ;

        }


}
