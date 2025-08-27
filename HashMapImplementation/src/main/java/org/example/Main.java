package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer,Integer> customHashMap = new CustomHashMap<>(10,0.75f);
        customHashMap.put(2,3);
        customHashMap.put(4,5);
        customHashMap.put(7,8);
        System.out.println(customHashMap.get(2));
        customHashMap.put(2,0);
        System.out.println(customHashMap.get(2));
        System.out.println(customHashMap.containsKey(2));
        System.out.println(customHashMap.containsKey(10));
        System.out.println(customHashMap.size());
        System.out.println(customHashMap.isEmpty());
    }
}