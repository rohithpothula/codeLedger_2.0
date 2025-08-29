package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Here if you see this is the Functional interface which is used for lambda expressions this MyFunctionalInterface will have only one method Single abstract method which is implemented down
        MyFunctionalInterface myFunctionalInterface = ()->{System.out.println("This is the lambda expression");};
        myFunctionalInterface.execute();


        MyFunctionalInterface2<Integer,Integer> myFunctionalInterface2 = (Integer a,Integer b) ->{System.out.println(a+b);};
        myFunctionalInterface2.execute(3,4);

        Predicate<Integer> predicate = ( Integer n) -> {return n%2==0;};

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println(list.stream().filter(predicate).count());

        Consumer<Integer> consumer = (Integer n) -> {System.out.println(n);};
        consumer.accept(2);

//        Consumer<T>: Takes one argument and returns nothing (e.g., accept(T t)).
//
//        Supplier<T>: Takes no arguments and returns a value (e.g., get()).
//
//        Function<T,R>: Takes an argument and returns a result (e.g., apply(T t)).
//
//        Predicate<T>: Takes an argument and returns a boolean (e.g., test(T t)).

//        these are the examples of inbuilt functional Interfaces available in java.util.packages
    }
}