package org.example;

public class Person implements Comparable<Person>{
    String name;
    int age;
    String profession;

    public Person(int age, String name, String profession) {
        this.age = age;
        this.name = name;
        this.profe
    ssion = profession;
    }

    @Override
    public int compareTo(Person o) {
        return o.age-this.age;
    }

    @Override
    public String toString() {
        return age + ": " + name + ": " + profession;
    }
}
