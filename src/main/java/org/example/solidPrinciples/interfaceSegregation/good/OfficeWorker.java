package org.example.solidPrinciples.interfaceSegregation.good;

public class OfficeWorker implements OfficeWork{
    @Override
    public void doOfficeWork() {
        System.out.println("Doing office work");
    }
}
