package org.example;

public class ThreadQuestion {

    private int counter = 0;
    private int max_counter = 10;
    private int turn =1;
    private final Object lock = new Object();

    public void printSequence(int threadId){
        while(true){
            synchronized (this){
                while(turn !=threadId && counter<=max_counter){
                    try {
//                        lock.wait();
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (counter>max_counter){
//                    lock.notifyAll();
                    notifyAll();
                    break;
                }
                System.out.print("T" + threadId + ":" + counter + " ");
                counter++;
                turn = (turn %3)+1;
//                lock.notifyAll();
                notifyAll();
            }
        }
    }


    public static void main(String[] args){

        ThreadQuestion threadQuestion = new ThreadQuestion();

        Thread thread1 = new Thread(()->{threadQuestion.printSequence(1);});

        Thread thread2 = new Thread(()->{threadQuestion.printSequence(2);});

        Thread thread3 = new Thread(()->{threadQuestion.printSequence(3);});

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
