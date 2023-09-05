package org.example.designPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle(1,1, 5);
        Shape rectanglePrototype = new Rectangle(4, 10);

        Shape clonedCircle = circlePrototype.clone();
        Shape clonedRectangle = rectanglePrototype.clone();

        circlePrototype.draw();
        clonedCircle.draw();
        rectanglePrototype.draw();
        clonedRectangle.draw();
    }
}
