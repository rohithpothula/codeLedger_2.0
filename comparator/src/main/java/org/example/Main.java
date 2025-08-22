package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] employees = {new Person(30,"Rohith","CEO"),
                              new Person(28,"Shiva","CFO"),
                            new Person(56,"Nagesh","HR Head")};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

//        When we use comparable there will be natural ordering of objects
//        this comparable we can use when we have authority to change the class defination
//        here there will be a method we have to override we have to make changes in that compareTo method


        Comparator<Car> carComparator = (c1,c2)-> c2.id-c1.id;
        Car[] carsArray = {new Car(1,"Red","Ultimate","Ferrari",99999999.0, LocalDate.of(2027, 1, 1)),
                new Car(2,"white","Beast","Rolls Royace",999999999.0, LocalDate.of(2028, 1, 1)),
                new Car(3,"Black","Diamond","BMW",999999999.0, LocalDate.of(2029, 1, 1))};
        Arrays.sort(carsArray,carComparator);
        List<Car> carList = Arrays.asList(carsArray);
//        Collections.sort(carList, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.id-o1.id;
//            }
//        });

        System.out.println(carList);

//        Collections.sort(carList, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                if(o1.name.compareTo(o2.name)>0)return -1;
//                else if(o1.name.equals(o2.name)) return 0;
//                else return 1;
////                return o2.name-o1.name;
//            }
//        });

//        System.out.println((Arrays.toString(carsArray)));

        Comparator<Car> carComparator1= Comparator.comparingInt((Car c1) -> c1.id).thenComparing((Car c1)-> c1.name).reversed();
        Collections.sort(carList,carComparator1);
        System.out.println(carList);


        Car c1 = new Car();
        Car c2 = new Car();

        if(c1.equals(c2)){

        }
    }
}