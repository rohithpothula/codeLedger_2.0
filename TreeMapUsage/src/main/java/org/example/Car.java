package org.example;

public class Car implements Comparable<Car>{

    int price;
    String name;
    String model;

    Car(int price,String name,String model){
        this.price=price;
        this.name=name;
        this.model=model;
    }

    @Override
    public int compareTo(Car c) {
        return this.price-c.price;
    }
}
