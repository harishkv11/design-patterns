package org.example.solidPrinciples.dependancyInversion.bad;

public class Calculator {
    public int operation(int a, int b, String type){
        int result = 0;
        switch (type){
            case "add":
                AddOperation operation = new AddOperation(); // Breaking DIP principle
                result = operation.add(a,b);
                break;
            case "subtract":
                SubtractOperation operation1 = new SubtractOperation();
                result = operation1.subtract(a,b);
                break;
        }
        return result;
    }
}
