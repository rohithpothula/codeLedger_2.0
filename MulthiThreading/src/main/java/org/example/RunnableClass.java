package org.example;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Rohith");
        System.out.println(Thread.currentThread().getName());
    }
}
