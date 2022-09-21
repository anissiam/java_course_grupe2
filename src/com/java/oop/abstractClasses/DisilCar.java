package com.java.oop.abstractClasses;

public class DisilCar extends Car{
    @Override
    public void power() {
        System.out.println("Disil");
    }

    @Override
    public void type() {
        System.out.println("DisilCar");
    }
}
