package org.example;

public class SingleTon {

    private static SingleTon singleTonInstance = null;

    public static SingleTon getSingleTonInstance() {
        if(singleTonInstance == null){
            synchronized(SingleTon.class) {
                if (singleTonInstance == null) {
                    singleTonInstance = new SingleTon();
                    return singleTonInstance;
                }
            }
        }
        return singleTonInstance;
    }
}
