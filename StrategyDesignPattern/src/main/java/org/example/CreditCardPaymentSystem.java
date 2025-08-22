package org.example;

public class CreditCardPaymentSystem implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("Credit Payment System");
    }
}
