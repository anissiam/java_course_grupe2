package com.java2.basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int n = 10 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scanner.nextInt();
        if(x>6){
           return;
        }
        switch (x){
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                break;
            case 3 :
                System.out.println(" 2 OR 3");
                break;
            case 4 :
                System.out.println("4");
                break;
            case 5 :
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("Not found");
                break;

        }



      /*  if(x >=90){
            System.out.println("EX");
        }else if(x>=80){
            System.out.println("V Good");
        }else if(x>=70){
            System.out.println("Good");
        }else {
            System.out.println("LOOOOOOSER");
        }
            */

        /*if(x<=25){
            System.out.println("F");
        }else if(x>25 && x<=45){
            System.out.println("E");
        } else if (x > 45 && x <= 50) {
            System.out.println("D");
        }else if(x>50 && x<=60){
            System.out.println("C");
        }else if(x>60 && x<=80){
            System.out.println("B");
        }else {
            System.out.println("A");
        }*/


        /*if(x>0){
            System.out.println(n/x);
        }else if(x<0){
            System.out.println(n/x);
        }else {
            System.out.println("Not exist");
        }*/



        /*if(x<0){
            System.out.println("less than 0");
            if(x%2==0){
                System.out.println("Even");
            }else {
                System.out.println("odd");
            }
        }else if(x==0){
            System.out.println("equals 0");
        }else {
            System.out.println("greater than 0");
            if(x%2==0){
                System.out.println("Even");
            }else {
                System.out.println("odd");
            }
        }*/

       /* if(x==0){
            System.out.println("equals 0");
        }

        if(x>0){

        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String x = scanner.nextLine();*/

        /*String xx = "asfsdfdsfd@";
        if(xx.isEmpty()){
            if(xx.contains("@")){
                System.out.println("Email");
            }
        }else {
            System.out.println("x is empty");
        }*/

        /*if(x>10 && x%2==0){
            System.out.println(" x > 10 and Even");
        }else {
            System.out.println(" x > 10 and Odd");
        }*/

        /*if(x>10){
            if(x%2==0){
                System.out.println(" x > 10 and Even");
            }else {
                System.out.println(" x > 10 and Odd");
            }
        }else {
            if(x%2==0){
                System.out.println(" x <10 and Even");
                x = x + 5;
                if(x>10){

                }
            }else {
                System.out.println(" x < 10 and Odd");
            }
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        if(x<=25){
            System.out.println("F");
        }*/







        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scanner.nextInt();
        if(x<0){
            System.out.println("less than 0");
        }
        if(x==0){
            System.out.println("equals 0");
        }

        if(x>0){
            System.out.println("greater than 0");
        }*/



       /* int x = 3;
        if (x > 0) {
            System.out.println("x is greater than 0");
        }else{
    System.out.println(" x is less than or equal 0");
}*/






       /* Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
*/
        /*String s1 = "example@exmple.com";
        String s2 = "https://www.google.com";*/

        /*if(st.contains("@")){
            System.out.println("This " + st + "is email" );

        }else {
            System.out.println("This " + st + "is url" );
        }*/
        /*int x = 5;
        int y = 10;

       if(x%2==1){
           System.out.println(x + " is even ");
       }else {
           System.out.println(x + " is odd");
       }
*/
        /*if(!ss.isEmpty()){
            System.out.println("Empty");
        }*/
        // F       T

        /*if(x==y || x<y){
            System.out.println("Yes");
        }*/

/*
        String b = "hi";
*/
        /*if (b.contains("hi") && b.contains("HI")) {
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }*/



       /* Scanner input = new Scanner(System.in);
        int x = 10;
        String aa = "";
        System.out.println(aa.isEmpty());*/

        /*System.out.println("Enter year");
        String year = input.nextLine();

        System.out.println(year.charAt(0));
        System.out.println(year.charAt(1));
        System.out.println(year.charAt(2));
        System.out.println(year.charAt(3));*/

       /* String st1, st2;
        System.out.println("Enter first St");
        st1 = input.nextLine();

        System.out.println("Enter sec.. St");
        st2 = input.nextLine();

        System.out.println(st1.concat(st2));
*/



  /*      Scanner input = new Scanner(System.in);
        System.out.println("Please enter first no ");
        double x = input.nextDouble();

        System.out.println("Please enter secd no ");
        double y = input.nextDouble();

        System.out.println("Please enter thr no ");
        double w = input.nextDouble();

        double result = (x + y + w) / 3;
        System.out.println("AVA= " + result);
        */


    }
}