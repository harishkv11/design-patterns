package org.example.designPatterns.Factory;

public class Windows extends OperatingSystem{
    public Windows(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(){
        System.out.println("Change dir in windows");
    }

    @Override
    public void removeDir(){
        System.out.println("Remove dir in windows");
    }
}
