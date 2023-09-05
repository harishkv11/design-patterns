package org.example.designPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        OperatingSystem windowsSystem = OperatingSystemFactory.getOperatingSystem("Windows", "version", "64");
        windowsSystem.changeDir();
        windowsSystem.removeDir();

        OperatingSystem macSystem = OperatingSystemFactory.getOperatingSystem("Mac", "version", "32");
        macSystem.changeDir();
        macSystem.removeDir();
    }
}
