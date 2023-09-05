package org.example.solidPrinciples.dependancyInversion.bad;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.operation(10, 5, "add"));
        System.out.println(calculator.operation(10, 5, "subtract"));
    }
}
