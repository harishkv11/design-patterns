package org.example.solidPrinciples.openClose;

public class GoodCalculator {
    public int performOperation(int a, int b, Operation operation){
        return operation.performOperation(a, b);
    }
}
