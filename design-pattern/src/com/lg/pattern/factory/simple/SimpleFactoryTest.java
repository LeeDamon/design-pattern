package com.lg.pattern.factory.simple;

import com.lg.pattern.factory.Milk;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory simpleFactory=new SimpleFactory();
        Milk milk = simpleFactory.getMilk("telunsu");
        milk.getName();
        System.out.println(milk.getName());

    }

}
