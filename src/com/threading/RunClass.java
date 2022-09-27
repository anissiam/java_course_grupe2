package com.threading;

public class RunClass implements Runnable{
    private String name;
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            try {
                System.out.println(getName() + " "+  i);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
