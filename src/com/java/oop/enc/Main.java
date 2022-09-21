package com.java.oop.enc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner c = new Scanner(System.in);
        System.out.println("Please enter x :");
        int x = c.nextInt();
        System.out.println("Please enter y :");
        int y = c.nextInt();
        Calc calc = new Calc(x,y);
        calc.add();

        Calc calc1 = new Calc();
        calc1.setX(x);
        calc1.setY(y);
        calc1.add();
        calc1.sub();
*/
        Scanner c = new Scanner(System.in);

        System.out.println("Plz enter name");
        String name = c.nextLine();

        System.out.println("Plz enter length");
        int l = c.nextInt();

        System.out.println("Plz enter width");
        int w = c.nextInt();

        Shape obj1 = new Shape(l,w,name);

        obj1.area();
        obj1.printData();
    }
}
