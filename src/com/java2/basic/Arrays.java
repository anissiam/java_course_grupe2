package com.java2.basic;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        /*(4)
        String[][] month = {
                {"sat", "sun", "mon", "tu", "we", "thr", "fri"},
                {"sat", "sun", "mon", "tu", "we", "thr", "fri"},
                {"sat", "sun", "mon", "tu", "we", "thr", "fri"},
                {"sat", "sun", "mon", "tu", "we", "thr", "fri"}};
        for (int i = 0; i < month.length; i++) {
            System.out.println("Week" + (i + 1));
            for(int j = 0 ; j<month[i].length;j++){
                System.out.print(month[i][j] + " ");
            }
            System.out.println("");
        }*/
       /* (3)
       int[][] y = {{5,8,6} , {1,2,6,8} , {3,10,9} ,  {8,6,3}};

        System.out.println(y.length);
        System.out.println(y[0].length);
        System.out.println(y[1].length);
         for(int i=0;i<y.length ; i++){
             for(int j =0 ; j<y[i].length;j++){
                 System.out.print(y[i][j]+" ");
             }
             System.out.println("");
         }*/

        //error
       /* for(int i = 0; i<4; i++){
            for(int j = 0;j<4;j++){
                System.out.print(y[i][j]+ " ");
            }
            System.out.println("");
        }*/
        /*(2)
        int [][]x = new int[3][4];
        for(int i = 0; i<3; i++){
            for(int j = 0;j<4;j++){
                System.out.print(x[i][j]);
            }
        }*/
        // Multi dim. array
        //(1)
       /* int [][]x = new int[5][8];
        System.out.println(x.length);
        System.out.println(x[0].length);

        /*for(int i = 0 ; i<x.length;i++){
            System.out.print("x[" + i + "]");
            for(int j=0 ; j<x[i].length;j++){
                System.out.print(x[i][j] + "");
            }
            System.out.println("");
        }*/



        // One Dim.. array
        /*
        (8)
             //0  1  2  3  4   5   6   7
        int x[] = {2, 3, 0, 5, 6 , 8 , 0 , 1};
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if(min>x[i]){
                min = x[i];
            }
        }
        System.out.println(min);
*/
        /*(7)
        int x[] = {2, 3, 4, 5, 6 , 8 , 0 , 1};
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if(max<x[i]){
                max = x[i];
            }
        }
        System.out.println(max);*/
        /*
        (6)

        String[] names = {"ali", "sami", "mohammed", "anis", "ibrahim"};
        for(int i = 0 ; i<names.length ;i++){
            System.out.print(names[i] + " ");
        }

        for(String s:names){
            System.out.print(s+ " ");
        }
*/
        /* (5)

        int x[] = {2, 3, 4, 5, 6};
        int sum = 0;
        for (int y : x) {
            System.out.println(y);
            sum += y;
        }
        System.out.println(sum);
*/
        /*
        (4)

         */
        /*int x[]={2,3,4,5,6};
        int factorial=1;
        for(int i=0;i<x.length;i++){
            factorial*=x[i];
        }
        System.out.println(factorial);*/


        /*
        (3)

        int y[] = new int[7];
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter element");

        for(int i = 0;i<y.length; i++){
            System.out.println("Enter element [" + (i+1) + "]");
            y[i] = in.nextInt();
        }
        for(int i =0 ; i<y.length;i++ ){
            System.out.print(y[i] + "  ");
        }
 */

        /*
          (2)
               //0 1 2  3  4  5 6
        int[] xx = {5,8,10,50,90,0,10};
        //System.out.println(xx.length);
        //System.out.println(xx[7]); //Error
        //System.out.println(xx[1]); //8
        int sum = 0;
        for(int i=0 ; i<6 ;i++){
            System.out.println(xx[i]);
            sum += xx[i];
        }
        System.out.println(sum);
        */

       /*
       //(1)

        int x[] = new int[5];
        System.out.println(x.length);

        System.out.println(x);
        System.out.println(x[1]);
       // System.out.println(x[5]);// ArrayIndexOutOfBoundsException
       // System.out.println(x[-1]);// ArrayIndexOutOfBoundsException

        x[0] = 10;
        System.out.println(x[0]); //10
        System.out.println(x[1]); //0

        x[1] = x[0];
        System.out.println(x[1]); //10

        x[1] = 50;
        System.out.println(x[1]); //50
        x[1] = x[0];
        System.out.println(x[1]);

        x[2] = x[1] + x[0];
        System.out.println(x[2]);

        int y = x[1] + x[2];
        System.out.println(y);

        x[3] = y;
        System.out.println(x[3]);*/


    }
}
