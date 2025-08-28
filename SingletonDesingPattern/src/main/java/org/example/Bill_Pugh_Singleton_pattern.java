package org.example;

public class Bill_Pugh_Singleton_pattern {

    private Bill_Pugh_Singleton_pattern(){};

    public static class Bill_Pugh_Singleton_pattern_helper{
        private static final Bill_Pugh_Singleton_pattern billPughSingletonPattern_Instance = new Bill_Pugh_Singleton_pattern();
    }

    public static Bill_Pugh_Singleton_pattern getInstance(){
        return Bill_Pugh_Singleton_pattern_helper.billPughSingletonPattern_Instance;
    }
}
