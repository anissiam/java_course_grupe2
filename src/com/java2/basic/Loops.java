package com.java2.basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Hello
        for (int i = 1; i <= 5; i++) {
            System.out.print((1.0/i) + "  ");
        }
        /*for (int i = 0; i <= 5; i++) {
            if(i==2){
                continue;
            }
            System.out.println(i);
        }*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("Please enter number below 100");
        int x = in.nextInt();
        for(int i = 0;i<=100;i++){
            System.out.println(x + " OK");
            System.out.println("Please enter number below 100 again");
            x = in.nextInt();
        }
        System.out.println(x + " Not okay");*/

        /*int sum =0;
        for(int x =0; x<=10;x++){
            sum += x;
        }
        System.out.println(sum);*/

       /* for(int i = 0;i<=5 ;i++){
            System.out.println("Hello");
        }*/
        /*int x = 0;

        System.out.println(x);  //0
        System.out.println(x++); //0 ///1
        System.out.println(++x); //2 //2*/

        /*int x = 0;
        do {

            System.out.println(++x);

        } while (x < 1);*/

       /* while (x<5){
            System.out.println(x);
        }*/

        //System.out.println("DOne");
        /*Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        int x = 0;
                 // 0  //9
        while (x<year.length()){ //0
            System.out.println(year.charAt(x));
            x++;
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter no1 ");
        int x = scanner.nextInt();
        int y = 1;
        int sum = 0;
        while (y<5){
            System.out.println("Please Enter no" + (y + 1));
            y++;
            sum += x;
            x = scanner.nextInt();
        }
        System.out.println("ava " + (sum / 5));*/
        /*int x = 7;
        int f = 1;
        while (x>=1){
            f *= x;
            x--;
        }
        System.out.println(f);*/
        /*int sum = 0;
        int x = 1;
        while (x<=100){
            sum += x;
            x++;
        }
        System.out.println("Sum is : " + sum);*/

     /*  *//* int x = 0;*//*
        int sum = 0;
        int x = 0;

        do {
            System.out.println(++x);
        } while (x <= 5);
*/
      /*  while (x<=5){
            System.out.println(++x);
        }*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter number between 0 to 100");
        int x = in.nextInt();
        while (x<=100){
            System.out.println(x+" OK");
            System.out.println("Enter number between 0 to 100 again");
            x = in.nextInt(); //110
        }
        System.out.println(x+ " not ok");*/
        /*while(x <= 5){ // x =6
            System.out.println(x);  // 5
            sum = sum + x; // sum = 15
            x++;
        }
        System.out.println(sum);*/



        /*int x = 0;
        while (x<100){
            x += 2;
            System.out.println(x);
            *//*if(x%2==0){
                System.out.println(x);
            }*//*

        }*/
        /*while (true){
            System.out.println("Hello");
        }*/
    }
}
