package com.lg.pattern.singleton.lazy;

public class LazyInnerClass {

    //防止范式
    private static Boolean initialized = false;
    //默认使用LazyInnerClass的时候，会先初始化内部类
    //如果不使用的时候内部类是不加载的
    public LazyInnerClass() {
        //这里是为了防止反射入侵
        synchronized (LazyInnerClass.class){
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例模式已经被侵犯！");
            }
        }
    }

    //static 为了是单例空间共享   final是方法不能被重写、重载
    public static final LazyInnerClass getInstance() {
        //在访问之前一定会访问内部类
        return LazyHoler.LAZY;
    }

    private static class LazyHoler{
        private static final LazyInnerClass LAZY=new LazyInnerClass();
    }




}
