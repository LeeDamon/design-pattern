package com.lg.pattern.singleton.test;

import com.lg.pattern.singleton.RegisterMap.RegisterEnum;
import com.lg.pattern.singleton.RegisterMap.RegisterMap;
import com.lg.pattern.singleton.lazy.Lazy;
import com.lg.pattern.singleton.lazy.LazyInnerClass;
import com.lg.pattern.singleton.lazy.LazySynchronized;
import com.lg.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

public class SingletonTest {

   public static void main(String[] args) {

      int  count = 200;

      //发令枪
      CountDownLatch latch = new CountDownLatch(count);

      long startLong=System.currentTimeMillis();

      for (int i = 0; i < count; i++) {

         new Thread(){

            @Override
            public void run() {

               try {//测试反射能够打破 LazyInnerClass 方式

                  Class<?> clazz = LazyInnerClass.class;
                  Constructor cs = clazz.getDeclaredConstructor(null);
                  //强制访问
                  cs.setAccessible(true);
                  Object o1= cs.newInstance();
                  System.out.println(o1);

               } catch (Exception e) {
                  e.printStackTrace();
               }
               try {
                  //这里会阻塞线程  知道latch中的count=0 时候 程序才能往下走，  发令枪的作用就是为了将所有线程都阻塞在这里
                  //当count=0 时候发出指令  万箭齐发  所有线程并发去执行  去创建单例的示例
                  latch.await();
                  //Object object=Hungry.getInstance();//恶汉模式

                  //使用Synchronized 有性能的消耗问题
                  Object object = Lazy.getInstance();//懒汉模式
                  //Object object = LazySynchronized.getInstance();//加锁的懒汉模式
                  //Object object = LazyInnerClass.getInstance();//使用内部类的懒汉模式

                  //Object object = RegisterMap.getInstance(null);
                  //RegisterEnum.INSTANCE.getInstance();

                  System.out.println(System.currentTimeMillis() + "@" + object);

               }catch (Exception e){
                  e.printStackTrace();
               }
            }
         }.start();
         latch.countDown();//
      }
      long endLong=System.currentTimeMillis();
      System.out.println("用时："+(endLong-startLong));

      //序列化
//      Seriable s1=null;
//      Seriable s2=Seriable.getInstance();
//      FileOutputStream fos = null;
//      try {
//
//         fos = new FileOutputStream("Seriable.obj");
//         ObjectOutputStream oos =new ObjectOutputStream(fos);
//         oos.writeObject(s2);
//         oos.flush();
//         oos.close();
//
//         FileInputStream fis=new FileInputStream("Seriable.obj");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         s1 =(Seriable) ois.readObject();
//         ois.close();
//
//         System.out.println(s1 == s2);
//
//
//      }catch (Exception e) {
//         e.printStackTrace();
//      }


   }


}
