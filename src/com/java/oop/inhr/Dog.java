package com.java.oop.inhr;

public class Dog extends Animal{
    void print(){
        System.out.println("Dog name :" + name);

    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
