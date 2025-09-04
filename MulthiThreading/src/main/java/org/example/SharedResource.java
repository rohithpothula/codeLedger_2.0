package org.example;

public class SharedResource {
    boolean itemAvailabe = false;

    public synchronized void addItem(){
        itemAvailabe=true;
        System.out.println("Item added by :" + Thread.currentThread().getName() + " Invoking others threads which are in waiting state");
        notifyAll();
    }

    public synchronized void consumeItem() throws InterruptedException {
        System.out.println("Consume Item method invoked by :"+Thread.currentThread().getName());

        while (!itemAvailabe){
            System.out.println("Thread"+Thread.currentThread().getName() +"is waiting since item is not available");
            wait();
        }
        System.out.println("Item is consumed by"+Thread.currentThread().getName());
        itemAvailabe=false;
    }
}
