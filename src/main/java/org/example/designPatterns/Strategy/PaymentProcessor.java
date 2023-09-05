package org.example.designPatterns.Strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(){
        paymentStrategy.pay();
    }
}
