package com.threading;

public class Main {
    public static void main(String[] args) {

        RunClass runClass = new RunClass();
        runClass.setName("Run0");
        Thread thread = new Thread(runClass);
        thread.start();

        RunClass runClass1 = new RunClass();
        runClass1.setName("Run1");
        Thread thread1 = new Thread(runClass1);
        thread1.start();


        /*ThreadsClass threadsClass1 = new ThreadsClass();
        threadsClass1.setName("T1");
        threadsClass1.start();
        *//*try {
            threadsClass1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*//*

        ThreadsClass threadsClass = new ThreadsClass();
        threadsClass.setName("T2");
        threadsClass.start();*/

    }
}
