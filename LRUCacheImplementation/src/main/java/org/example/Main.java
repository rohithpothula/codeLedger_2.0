package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LRUCacheAdv cacheAdv = new LRUCacheAdv(2);
        cacheAdv.put(1,1);
        cacheAdv.put(2,2);
        System.out.println(cacheAdv.get(1));
        cacheAdv.put(3,3);
        System.out.println(cacheAdv.get(1));
        System.out.println(cacheAdv.get(2));

    }
}