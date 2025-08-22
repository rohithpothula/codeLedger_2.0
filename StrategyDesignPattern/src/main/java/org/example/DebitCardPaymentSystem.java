package org.example;

public class DebitCardPaymentSystem implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("Debit Payment System");
    }
}
