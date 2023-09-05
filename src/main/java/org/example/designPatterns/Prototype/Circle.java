package org.example.designPatterns.Prototype;

public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(x,y, radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
