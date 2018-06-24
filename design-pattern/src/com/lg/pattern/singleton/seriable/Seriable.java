package com.lg.pattern.singleton.seriable;

import java.io.Serializable;


/**
 * 单例模式 在序列化中也是有问题的
 */
public class Seriable implements Serializable {

    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    /**
     * 防止反序列化的时候创建新的对象
     */
//    private Object readResolve() {
//        return INSTANCE;
//    }

}
