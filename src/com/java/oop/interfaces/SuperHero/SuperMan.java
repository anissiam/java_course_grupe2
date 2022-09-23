package com.java.oop.interfaces.SuperHero;

public class SuperMan extends Person implements SuperHero{

    public SuperMan(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void fly() {
        System.out.println("FLY");
    }

    @Override
    public void speed(int speed) {
        System.out.println(speed+ "KM/H");
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
