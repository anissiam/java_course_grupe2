package com.threading;

public class ThreadsClass extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(getName());
        for(int i = 0; i<10; i++){
            try {
                System.out.println(getName() + " "+  i);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
