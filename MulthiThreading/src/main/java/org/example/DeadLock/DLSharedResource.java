package org.example.DeadLock;

public class DLSharedResource {

    private Object resource1=new Object();
    private Object resource2=new Object();


    public  void task1() throws InterruptedException {
        synchronized (resource1){
            Thread.sleep(5000);

            synchronized (resource2) {

                System.out.println(resource2);
            }
        }


    }

    public void task2() throws InterruptedException {

        synchronized (resource2){
            Thread.sleep(5000);

            synchronized (resource1) {

                System.out.println(resource1);
            }
        }

    }
}
