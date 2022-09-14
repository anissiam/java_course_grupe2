package com.java.oop.staticEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Car car0 = new Car(60 , 2018);
        System.out.println(Car.name);
        Car.name = "FPRD";
        car0.printData();

        Car car1 = new Car(80 , 2020);
        System.out.println(Car.name);

        car1.printData();

       Car.getCarName();
       System.out.println(Car.name);*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add\n2.Sub");
        int c = scanner.nextInt();
        switch (c) {
            case 1 : Calc.addNumbers(10,20);
                break;
            case 2 :
                Calc.subNumbers(10, 20);
                break;
        }
    }

}
