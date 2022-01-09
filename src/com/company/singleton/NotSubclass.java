package com.company.singleton;

public class NotSubclass  {

    public static void main(String[] args) {
        NotSubclass obj = new NotSubclass();
        // won't run for protected onwards along with protected
        // int n = obj.num ;
    }
}
