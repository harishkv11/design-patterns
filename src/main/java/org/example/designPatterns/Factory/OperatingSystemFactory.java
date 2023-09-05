package org.example.designPatterns.Factory;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){}

    public static OperatingSystem getOperatingSystem(String type, String version, String architecture){
        switch (type){
            case "Windows":
                return new Windows(version, architecture);
            case "Mac":
                return new Mac(version, architecture);
        }
        return null;
    }
}
