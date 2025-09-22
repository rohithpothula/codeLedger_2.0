package org.example;

import java.io.Serializable;

public class PaymentStrategy implements Serializable {

    public PaymentSystem paymentSystem;

    public PaymentStrategy(PaymentSystem paymentSystem) {
        this.paymentSystem=paymentSystem;
    }

    public void executePayment(){
        this.paymentSystem.pay();
    }




}
