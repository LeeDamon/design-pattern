package com.lg.pattern.singleton.lazy;

public class LazySynchronized {
    private static LazySynchronized ourInstance = null;

    public static synchronized LazySynchronized getInstance() {
        if(ourInstance == null){
            ourInstance=new LazySynchronized();
        }
        return ourInstance;
    }

    private LazySynchronized() {
    }
}
