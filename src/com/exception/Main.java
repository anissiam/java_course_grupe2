package com.exception;

import com.java.oop.animal.Animal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Animal animal;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        try {

            animal.display();

            System.out.println("Enter no up to 0 . ");
             x = scanner.nextInt(); // throw
            int div = 10 / x;
            System.out.println(div);
        }catch (ArithmeticException e){
          System.out.println("You can not divid by zero");
          return;
        }catch (InputMismatchException e1){
            System.out.println("You enter String value");
        }catch (NullPointerException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("OK");
        }

        System.out.println("Enter value");
        int y = scanner.nextInt();

        System.out.println("Done");
    }
}
