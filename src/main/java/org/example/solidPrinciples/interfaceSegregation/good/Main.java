package org.example.solidPrinciples.interfaceSegregation.good;

public class Main {
    public static void main(String[] args) {
        FactoryWork work = new FactoryWorker();
        work.doFactoryWork();

        OfficeWork work1 = new OfficeWorker();
        work1.doOfficeWork();
    }
}
