package com.java.oop.abstractClasses;

public class ElecCar extends Car{


    @Override
    public void power() {
        System.out.println("Elc");
    }

    @Override
    public void type() {
        System.out.println("ElecCar");
    }
}
