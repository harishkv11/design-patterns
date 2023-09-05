package org.example.designPatterns.Template;

public class Coffee extends BeverageTemplate{
    @Override
    void brew() {
        System.out.println("Coffee is brewing");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding coffee, milk and coffee");
    }
}
