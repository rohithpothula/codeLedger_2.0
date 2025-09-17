package org.example;

import org.example.DeadLock.DLSharedResource;
import org.example.ProducerConsumer.PCSharedResource;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Runnable runnableobj = new RunnableClass();
        Thread thread  = new Thread(() -> {
            System.out.println("This is in the main class ");
            System.out.println(Thread.currentThread().getName());
        });
//        thread.start();


        ThreadClass threadClass = new ThreadClass();
//        threadClass.start();;


        MonitorLockExample monitorLockExample = new MonitorLockExample();
        Thread thread1=new Thread(()->{monitorLockExample.task1();});
        Thread thread2=new Thread(()->{monitorLockExample.task2();});
        Thread thread3=new Thread(()->{monitorLockExample.task3();});


//        thread1.start();
//        thread2.start();
//        thread3.start();

        SharedResource sharedResource = new SharedResource();

        Thread producerItem = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });


        Thread consumerItem = new Thread(()->{
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

//        producerItem.start();
//        consumerItem.start();


        PCSharedResource pcSharedResource = new PCSharedResource();

        Thread pcProducer = new Thread(()->{
            try {
                for(int i=0;i<5;i++) {
                    pcSharedResource.produce();
//                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread pcConsumer = new Thread(()->{
            try {
                for(int i=0;i<6;i++) {
                    pcSharedResource.consume();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

//        pcProducer.start();
//        pcConsumer.start();

        DLSharedResource dlSharedResource = new DLSharedResource();

        Thread resource1Thread = new Thread(()->{
            try {
//                Thread.sleep(2000);
                dlSharedResource.task1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread resource2Thread = new Thread(()->{
            try {
//                Thread.sleep(2000);
                dlSharedResource.task2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        resource1Thread.start();
        resource2Thread.start();

    }
}