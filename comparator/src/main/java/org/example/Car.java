package org.example;

import java.time.LocalDate;
//import java.util.Date;

public class Car {
    int id;
    String name;
    double price;
    String model;
    String color;

    public Car(int id, String color, String model, String name, double price, LocalDate purchased) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.name = name;
        this.price = price;
        this.purchased = purchased;
    }

    LocalDate purchased;



    @Override
    public String toString() {
        return id + ": " + name + ": " + color + ": " + model + ": " + price;
    }

    public boolean equals(Car o){
        if(this==o) return true;
        if(o==null || (o.getClass()!=getClass())) return false;

        if(this.name.equals(o.name) && (this.id==o.id)) return true;
        else return false;

    }
}
