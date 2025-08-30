package org.example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(7,"Rohith");
        treeMap.put(9,"Sudhakar");
        treeMap.put(3,"Narayana");
        for(Integer map_entry:treeMap.keySet()){
//            System.out.println(map_entry.getKey() + " :" + map_entry.getValue());
            System.out.println(map_entry);
            System.out.println(treeMap.get(map_entry));
        }

        treeMap.forEach((key,value)->{System.out.println(key+" " + value);});

        for(Map.Entry<Integer,String> map_entry:treeMap.entrySet()){
            System.out.println(map_entry.getKey() + " :" + map_entry.getValue());
        }

        TreeMap<Car,Integer> treeMap1 = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.price-o1.price;
            }
        });
        treeMap1.put(new Car(199999,"BMW","TopModel"),6);
        treeMap1.put(new Car(999999,"Ferrari","Top_Level_model"),9);
        treeMap1.put(new Car(99999999,"Benz","High_End_Model"),7);

        treeMap1.forEach((key,value)->{System.out.println(key.name+" :"+value);});

    }
}