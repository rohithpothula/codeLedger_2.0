package org.example;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("this is in the thread class");
        System.out.println(Thread.currentThread().getName());
    }
}
