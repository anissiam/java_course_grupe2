package com.java.oop.interfaces.SuperHero;

public class Main {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("Super man" , 200, "Male");
        superMan.fly();
        superMan.speed(500);
        System.out.println(superMan.toString());

        System.out.println("===========================================================");
        IronMan ironMan = new IronMan("Tony stark", 50, "Male");
        System.out.println(ironMan.toString());
        System.out.println(ironMan.clever());
        ironMan.money(20);
        ironMan.fly();
        ironMan.speed(200);
    }
}
