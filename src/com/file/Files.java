package com.file;

import java.io.*;

public class Files {
    public static void main(String[] args) {
       /* File file = new File("hello.txt");
        System.out.println(file.exists());*/
        File file = new File("HI1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c=  fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c=  fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        /*File file = new File("HI1.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("My name is locy".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


       /* try {
            FileReader fileReader = new FileReader("Hi.txt");
            //int c= fileReader.read();
            int c;
            while ((c = fileReader.read())!=-1){
                System.out.print((char) c);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/



        /*char[] name = {'a', 'n', 'i', 's'};
        try {
            //file.createNewFile();
            *//*System.out.println(file.getAbsoluteFile());
            System.out.println(file.exists());*//*
            FileWriter fileWriter = new FileWriter("Hi.txt");
            fileWriter.write("Hello from java ");
            fileWriter.write(70);
            fileWriter.write(name);
            fileWriter.flush();
            fileWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
