package com.lg.pattern.singleton.hungry;

/**
 * 饿汉模式就是 事先创建好了对象实力
 * 优点：没有锁，执行效率高
 * 用户体验上来说，比懒汉式更好
 *
 * 缺点：类加载的时候就初始化了，用不用都会占空间
 * 有可能浪费空间，占着茅坑不拉屎
 */
public class Hungry {

   private Hungry(){}

   private static Hungry hungry = new Hungry();

   public static Hungry getInstance(){
      return hungry;
   }

}



