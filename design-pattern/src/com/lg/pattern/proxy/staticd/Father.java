package com.lg.pattern.proxy.staticd;

public class Father {

    public Person person;

    public Father(Person person) {
        this.person=person;

    }

    public void findLove() {
        System.out.println("根据你的要求给你找对象！");
        this.person.findLove();

    }
}
