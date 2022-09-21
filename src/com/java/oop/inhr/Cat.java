package com.java.oop.inhr;

public class Cat extends Animal {

    String space = "MARS";

    public void printCat() {

       // System.out.println("Animal = " + name + " " + age + " " + eyeColor);
    }

    @Override
    public void hi() {
        System.out.println("Hello from Cat!!");
    }


}
