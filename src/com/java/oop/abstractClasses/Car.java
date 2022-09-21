package com.java.oop.abstractClasses;

public abstract class Car {
    String name;
    String color;

    public Car() {
    }

    public void printCar(){
        System.out.println("Car");
    }

    public abstract void power();
    public abstract void type();
}
