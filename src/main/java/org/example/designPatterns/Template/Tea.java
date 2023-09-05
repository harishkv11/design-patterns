package org.example.designPatterns.Template;

public class Tea extends BeverageTemplate{
    @Override
    void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding tea, sugar and milk");
    }
}
