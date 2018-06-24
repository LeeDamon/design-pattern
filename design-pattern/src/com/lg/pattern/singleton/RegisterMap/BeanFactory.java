package com.lg.pattern.singleton.RegisterMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private BeanFactory() { }


    //线程安全的
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {

        if (ioc.containsKey(className)) {
            return ioc.get(className);
        } else {
            try {
                Object object= Class.forName(className).newInstance();
                ioc.put(className, object);
                return object;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

}
