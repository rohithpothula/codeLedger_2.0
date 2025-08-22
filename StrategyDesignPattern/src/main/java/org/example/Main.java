package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCardPaymentSystem creditCardPaymentSystem = new CreditCardPaymentSystem();
        UPIPaymentSystem upiPaymentSystem = new UPIPaymentSystem();

        PaymentStrategy paymentStrategy = new PaymentStrategy(creditCardPaymentSystem);
        PaymentStrategy paymentStrategy1 = new PaymentStrategy(upiPaymentSystem);
//        paymentStrategy.paymentSystem.pay();
//        paymentStrategy1.paymentSystem.pay();
        paymentStrategy.executePayment();
        paymentStrategy1.executePayment();
    }
}