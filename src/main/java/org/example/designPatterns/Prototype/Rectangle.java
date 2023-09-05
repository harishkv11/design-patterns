package org.example.designPatterns.Prototype;

public class Rectangle implements Shape{
    private int height;
    private int width;
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectange with height "+ height + " and width "+width);
    }
}
