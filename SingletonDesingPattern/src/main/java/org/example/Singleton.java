package org.example;

public class Singleton {

    private static volatile Singleton singletonInstance = null;

    private Singleton(){};

    public static Singleton getSingleton(){
        if(singletonInstance==null){
            synchronized (Singleton.class) {
                if(singletonInstance==null){
                    singletonInstance= new Singleton();

                }
            }
        }
        return singletonInstance;
    }
}
