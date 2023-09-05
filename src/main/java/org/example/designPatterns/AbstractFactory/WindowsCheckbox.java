package org.example.designPatterns.AbstractFactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Windows Checkbox");
    }
}
