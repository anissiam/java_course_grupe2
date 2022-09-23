package com.java.oop.interfaces;

public class Computer {
    String cpu;
    String gpu;
    int storage;
    int ram;

    public Computer() {
    }

    public Computer(String cpu, String gpu, int storage, int ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storage=" + storage + "TB"+
                ", ram=" + ram + "GB"+
                '}';
    }
}
