package org.example.designPatterns.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
