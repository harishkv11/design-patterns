package org.example.designPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentStrategy creditCardStrategy = new CreditCardPayment("xxxx123", "random");
        paymentProcessor.setPaymentStrategy(creditCardStrategy);
        paymentProcessor.doPayment();

        PaymentStrategy paypalStrategy = new PayPalPayment("harish@gmail.com");
        paymentProcessor.setPaymentStrategy(paypalStrategy);
        paymentProcessor.doPayment();
        paymentProcessor.doPayment();
    }
}
