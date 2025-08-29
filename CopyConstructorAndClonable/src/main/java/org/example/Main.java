package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c = new Car("BMW","Red",199999999);
        Car c1 = new Car(c); // here we have sent Object as parameter which is copy constructor
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.price);


        System.out.println("**********************************")
        House h = new House("Jubliee Hilss",199999999,"1-1/3");
        House h1 = h.clone();
        System.out.println(h1.area);
        System.out.println(h1.House_no);
        System.out.print(h1.price);

    }
}