package com.java.oop.enc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
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

    }
}
