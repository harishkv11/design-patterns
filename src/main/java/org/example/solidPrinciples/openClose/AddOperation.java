package org.example.solidPrinciples.openClose;

public class AddOperation implements Operation{
    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}
