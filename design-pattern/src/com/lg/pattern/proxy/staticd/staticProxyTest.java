package com.lg.pattern.proxy.staticd;

public class staticProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());

        father.findLove();

    }

}


