package org.example.designPatterns.AbstractFactory;

public class MacCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Mac Checkbox");
    }
}
