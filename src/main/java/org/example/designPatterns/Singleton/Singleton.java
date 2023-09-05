package org.example.designPatterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        synchronized (Singleton.class) {     // Thread safe
            if(instance == null){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
