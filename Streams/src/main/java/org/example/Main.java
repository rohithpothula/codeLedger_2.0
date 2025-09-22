package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("pranika","rohith","maitrayee","rohith","maitryaee","pranika");
        names.stream().distinct().forEach(System.out::println);
        }
}