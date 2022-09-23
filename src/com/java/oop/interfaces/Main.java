package com.java.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        /*Computer computer = new Computer("i9", "3090Ti", 1 , 128);
        System.out.println(computer.toString());*/

        MSI msi = new MSI("i9", "3090Ti", 1 , 128);
        System.out.println(msi.toString());
        msi.setTank(200);

        MSICustom msiCustom = new MSICustom("i9", "3090Ti", 1 , 128);
        System.out.println(msiCustom.toString());
        msiCustom.setTank(200);
        msiCustom.RGB();
    }
}
