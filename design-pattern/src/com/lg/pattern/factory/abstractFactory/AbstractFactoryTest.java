package com.lg.pattern.factory.abstractFactory;

import com.lg.pattern.factory.Milk;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        MilkFactory milkFactory=new MilkFactory();
        Milk milk = milkFactory.getMengniu();
        System.out.println(milk.getName());
    }
}
