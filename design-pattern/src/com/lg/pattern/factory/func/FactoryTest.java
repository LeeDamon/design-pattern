package com.lg.pattern.factory.func;

import com.lg.pattern.factory.Milk;

public class FactoryTest {

    public static void main(String[] args) {

        /**
         * 根据对应的工厂类 获得对应的工厂产品
         */
        Factory factory=new MengniuFactory();
        Milk milk=factory.getMilk();

        System.out.println(milk.getName());
    }

}


