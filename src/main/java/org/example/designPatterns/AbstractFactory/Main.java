package org.example.designPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsUIFactory();
        UIFactory macFactory = new MacUIFactory();
        Button windowsButton = windowsFactory.createButton();
        windowsButton.render();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macCheckbox.render();
    }
}
