package com.lg.pattern.singleton.lazy;

public class Lazy {
    private static Lazy ourInstance = null;

    public static Lazy getInstance() {
        if(ourInstance == null){
            //这里就有可能存在线程安全问题，有可能两个线程都进入到这里，new出对象
            ourInstance=new Lazy();
        }
        return ourInstance;
    }

    private Lazy() {
    }
}
