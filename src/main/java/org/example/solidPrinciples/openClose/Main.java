package org.example.solidPrinciples.openClose;

public class Main {
    public static void main(String[] args) {
        BadCalculator badCalculator = new BadCalculator();
        System.out.println(badCalculator.performOperation(10, 5, "sum"));
        System.out.println(badCalculator.performOperation(10, 5, "subtract"));

        GoodCalculator goodCalculator = new GoodCalculator();
        System.out.println(goodCalculator.performOperation(10, 5, new AddOperation()));
        System.out.println(goodCalculator.performOperation(10, 5, new SubtractOperation()));
    }
}
