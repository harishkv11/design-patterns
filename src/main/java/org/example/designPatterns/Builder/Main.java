package org.example.designPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel")
                .gpu("Nvidea")
                .ram("8 GB")
                .storage("256 SSD")
                .build();

        System.out.println(computer.toString());

        Computer comp = new Computer.Builder()
                .cpu("AMD")
                .build();

        System.out.println(comp.toString());
    }
}
