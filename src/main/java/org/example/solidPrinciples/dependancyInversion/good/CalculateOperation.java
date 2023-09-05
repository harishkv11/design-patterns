package org.example.solidPrinciples.dependancyInversion.good;

public class CalculateOperation {
    public int calculate(int a, int b, Operation operation){
        return operation.performOperation(a, b);
    }
}
