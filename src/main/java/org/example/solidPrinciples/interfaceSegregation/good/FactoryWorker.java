package org.example.solidPrinciples.interfaceSegregation.good;

public class FactoryWorker implements FactoryWork{
    @Override
    public void doFactoryWork() {
        System.out.println("Doing factory work");
    }
}
