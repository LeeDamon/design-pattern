package com.lg.pattern.proxy.custom;

import com.lg.pattern.proxy.dynamic.ZhangSan;
import com.lg.pattern.proxy.staticd.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class GPProxyTest {
    public static void main(String[] args) {

        try {
            GPMeipo gpMeipo=new GPMeipo();
            Person obj=(Person)gpMeipo.getInstance(new ZhangSan());
            //System.out.println(obj.getClass());
            //obj.findLove();

            //JDK动态代理的原理
            //1  拿到被代理对象的引用  并且获取到它所有的接口  通过反射获取
            //2  JDK  Proxy类 生成一个新的类 同时这个新类要实现被代理类实现的所有的接口
            //3  动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
            //4  编译新生成的Java代码 .Class
            //5  在从新加载到JVM中运行
            //以上过程就是字节码重组

            //JDK中有一个规范   只要是$ 开头的一般都是自动生成的

            //通过反编译可以查看这个运行时生成的$Proxy0

            byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os=new FileOutputStream("/Users/ligang/Desktop/zhangsan.class");
            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
