package org.example.designPatterns.Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay() {
        System.out.println("Payment done using paypal, email : " + email);
    }
}
