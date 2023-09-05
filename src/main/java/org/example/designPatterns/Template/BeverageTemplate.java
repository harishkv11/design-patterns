package org.example.designPatterns.Template;

public abstract class BeverageTemplate {
    final void prepareBeverage(){
        addWater();
        brew();
        pourIntoCups();
        addIngredients();
    }

    abstract void brew();
    abstract void addIngredients();

    void addWater(){
        System.out.println("Adding Water");
    }

    void pourIntoCups(){
        System.out.println("Pouring Into Cups");
    }
}
