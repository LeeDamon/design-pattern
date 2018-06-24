package com.lg.pattern.proxy.dynamic;

import com.lg.pattern.proxy.staticd.Person;

public class ZhangSan implements Person {

    @Override
    public void findLove(){
        System.out.println("高富帅");
        System.out.println("180CM");
        System.out.println("八块腹肌");
    }

}
