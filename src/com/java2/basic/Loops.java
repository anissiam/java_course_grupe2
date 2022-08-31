package com.java2.basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for(int i = 0 ; i<10 ;  i++){
            for (int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i = 1 ; i<=4 ; i++){
            System.out.println("Week " + i );
            for(int j = 1; j<=7 ; j++){
                System.out.print("Day " + j + "  ");
            }
            System.out.println();
            System.out.println("___________________________________");
        }*/

        /*for(int i = 0 ; i<3 ; i++){
            for (int j = 0 ;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*System.out.println();
        for(int i = 0 ; i<5 ; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 0 ; i<5 ; i++){
            System.out.print("*");
        }*/
        /*int f=1;
        for(int x= 1;x<=10;x++) {
            f = f * x;
            System.out.println(f);
        }

        System.out.println(f);*/
        /*
        6. كتابة برنامج يسمح للمستخدم بإدخال رقم ، ويجعل ويظهر البرنامج الرقم اذا كان زوجي ام فردي من خلال for loop ويتوقف البرنامج عند ادخال 0 .


        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        if(c==0){
            return;
        }
        for(;;){
             if(c%2!=0){
                System.out.println("odd");
                c = scanner.nextInt();
            }else {
                System.out.println("Even");
                c = scanner.nextInt();
            }

        }
*/
        /*5. كتابة برنامج يسمح للمستخدم بإدخال اسماء المستخدمين بحيث يتوقف البرنامج عند وجود اسم (No name) .
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();

        for(;;){
            if(c.equalsIgnoreCase("no name")){
                break;
            }
            c = scanner.nextLine();
        }*/

        // 1/1 + 1/2 + 1/3 + 1/4 +....+1/n
        /*int sum = 0;
        for (int x = 1; x < 100; x++) {

            if(x%2==0){
                sum += x;
            }
        }
        System.out.println(sum);*/

       /*
        //Hello
        for (int i = 1; i <= 5; i++) {
            System.out.print((1.0/i) + "  ");
        }*/
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
