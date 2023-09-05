package org.example.solidPrinciples.interfaceSegregation.bad;

public class OfficeWorker implements Worker{
    @Override
    public void doFactoryWork() {
        throw new IllegalArgumentException("Cannot do Factory Work");
    }

    @Override
    public void doOfficeWork() {
        System.out.println("Doing office work");
    }
}
