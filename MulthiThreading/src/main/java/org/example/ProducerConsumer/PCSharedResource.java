package org.example.ProducerConsumer;

import java.util.Random;

public class PCSharedResource {
    private final int size = 10;
    private int temp_size=0;
    private int index = -1;
    int []sharedResource = new int[size];
    Random rand = new Random();
    public synchronized void produce() throws InterruptedException {
        index++;
        while(temp_size==size){
            System.out.println("Thread :"+Thread.currentThread().getName()+" is waiting since shared Resource is full");
            wait();
        }
        sharedResource[index]= rand.nextInt(100);
        temp_size++;
        System.out.println("The value in "+index+"has been produced by thread "+Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while(temp_size==0){
            System.out.println("Thread :"+Thread.currentThread().getName()+"is waiting for the producer to produce");
            wait();
        }
        System.out.println("Thread :"+Thread.currentThread().getName()+"has consumed the value in "+index);
        index--;
        temp_size--;
        notifyAll();
    }
}
