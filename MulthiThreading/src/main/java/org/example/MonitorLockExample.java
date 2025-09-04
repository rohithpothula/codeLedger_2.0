package org.example;

public class MonitorLockExample {

    public synchronized void task1(){
        try{
            System.out.println("Inside task 1");
            Thread.sleep(10000);
            System.out.println("After waiting for sometime");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("Task2 before synchronized");
        synchronized (this){
            System.out.println("Task2 inside synchronized");
        }
    }

    public void task3(){
        System.out.println("Inside task3");
    }
}
