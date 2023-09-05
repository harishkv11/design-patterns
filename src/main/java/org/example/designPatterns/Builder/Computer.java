package org.example.designPatterns.Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public Computer() {
        this.cpu = "Default CPU";
        this.ram = "Default Ram";
        this.storage = "Default Storage";
        this.gpu = "Default GPU";
    }

    private String gpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    static class Builder{
        private Computer computer;

        Builder(){
            this.computer = new Computer();
        }

        Builder cpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        Builder ram(String ram) {
            computer.ram = ram;
            return this;
        }

        Builder storage(String storage){
            computer.storage = storage;
            return this;
        }

        Builder gpu(String gpu) {
            computer.gpu = gpu;
            return this;
        }

        Computer build(){
            return computer;
        }
    }
}
