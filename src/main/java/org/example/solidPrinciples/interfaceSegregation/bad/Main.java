package org.example.solidPrinciples.interfaceSegregation.bad;

public class Main {
    public static void main(String[] args) {
        Worker worker = new OfficeWorker();
        worker.doOfficeWork();
        worker.doFactoryWork();
    }
}
