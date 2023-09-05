package org.example.solidPrinciples.dependancyInversion.good;

public class SubtractOperation implements Operation{
    @Override
    public int performOperation(int a, int b) {
        return a-b;
    }
}
