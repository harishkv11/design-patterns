package org.example.designPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay() {
        System.out.println("Payment done using credit card, number : " + cardNumber);
    }
}
