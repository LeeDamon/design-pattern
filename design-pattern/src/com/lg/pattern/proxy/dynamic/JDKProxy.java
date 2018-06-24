package com.lg.pattern.proxy.dynamic;

import com.lg.pattern.proxy.staticd.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target){
        this.target=target;
        Class<?> tClass= target.getClass();
        //动态生成的$Proxy0的时候会将接口传进去  供其实现
        return Proxy.newProxyInstance(tClass.getClassLoader(), tClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理，我要给你找对象！");
        System.out.println("开始物色");
        method.invoke(this.target,args);
        System.out.println("如果合适就结婚");
        return null;
    }
}


