package com.java.oop.interfaces.SuperHero;

public class IronMan extends Person implements SuperHeroExtra{
    public IronMan(){

    }
    public IronMan(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void fly() {
     System.out.println("FLY");
    }

    @Override
    public void speed(int speed) {
        System.out.println(speed + "KM/H");
    }

    @Override
    public void money(int m) {
        System.out.println(m + "B");
    }

    @Override
    public String clever() {
        return "Clever";
    }
}
