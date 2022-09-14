package com.java.oop.staticEx;

public class Car {
    static String name = "BMW";
    private int price;
    private int year;

    public Car(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public Car() {
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printData(){
        System.out.println("year : " + year + " Price: " + price);
    }

    public static void getCarName(){
        System.out.println(name);

    }
}
