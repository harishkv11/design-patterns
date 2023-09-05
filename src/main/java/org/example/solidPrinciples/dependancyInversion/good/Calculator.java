package org.example.solidPrinciples.dependancyInversion.good;

public class Calculator {
    public static void main(String[] args) {
        CalculateOperation operation = new CalculateOperation();
        System.out.println(operation.calculate(134320, 5, new AddOperation()));
        System.out.println(operation.calculate(10, 5, new SubtractOperation()));
    }
}
