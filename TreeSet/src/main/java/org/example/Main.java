package org.example;

import java.util.Comparator;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Rohith");
        treeSet.add("Sundar Pichai");
        treeSet.add("Mahesh Babu");
        treeSet.add("Sundar Pichai");
        treeSet.add("Hanuman");

        treeSet.forEach((value)->System.out.println(value));

        TreeSet<Car> treeSet1 = new TreeSet<>(Comparator.naturalOrder());
        treeSet1.add(new Car("Ferrari","Top Model",999999999));
        treeSet1.add(new Car("BMW","High End Model",19999999));
        treeSet1.add(new Car("Benz","Limited Edition",99999999));

        treeSet1.forEach((value)->{System.out.println(value.name);});
    }
}