package com.java.oop.interfaces;

public class MSI extends Computer implements WaterCooler{
    public MSI(String cpu, String gpu, int storage, int ram){
        super(cpu, gpu,storage,ram);
    }
    @Override
    public void setTank(int tanl) {
        System.out.println(tanl + "ML");
    }

    @Override
    public String toString() {
        return "MSI{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                '}';
    }
}
