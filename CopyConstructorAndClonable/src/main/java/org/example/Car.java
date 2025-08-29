package org.example;

public class Car {
    String name;
    String color;
    int price;

    Car(String name, String color,int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }

//    This is the copy constructor where we pass the reference of the object as the parameter to the constructor of the class
    Car(Car c){
        this.name=c.name;
        this.color=c.color;
        this.price=c.price;
    }
}
