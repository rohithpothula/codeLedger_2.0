package org.example;

public class PaymentStrategy {

    public PaymentSystem paymentSystem;

    public PaymentStrategy(PaymentSystem paymentSystem) {
        this.paymentSystem=paymentSystem;
    }

    public void executePayment(){
        this.paymentSystem.pay();
    }
}
