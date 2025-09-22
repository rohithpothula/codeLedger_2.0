package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

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

//        Comparator


        String str = "java $ is my fav lang, @I like java lang";
//expected output: java=2, like=1, I=1, fav=1, is=1, lang=2, my=1

//        Arrays.stream(str.split(",")).map(word -> word.trim().toLowerCase()).map()
//        Arrays.stream(str.split("\\s")).map(word -> word.replaceAll("[a-z]")).filter(word -> !word.isEmpty()).collect(Collectors.groupingBy())
    }

































}