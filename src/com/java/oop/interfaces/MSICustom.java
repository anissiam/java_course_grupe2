package com.java.oop.interfaces;

public class MSICustom extends Computer implements WaterCoolerRGB{
    public MSICustom(String cpu, String gpu, int storage, int ram){
        super(cpu, gpu,storage,ram);
    }
    @Override
    public void setTank(int tank) {
        System.out.println(tank + "ML");

    }

    @Override
    public void RGB() {
        System.out.println("RGB");
    }
}
