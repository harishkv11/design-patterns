package org.example.designPatterns.Factory;

public class Mac extends OperatingSystem{
    public Mac(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(){
        System.out.println("Change dir in Mac");
    }

    @Override
    public void removeDir(){
        System.out.println("Remove dir in Mac");
    }
}
