package com.lg.pattern.singleton.RegisterMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册器方式
 */
public class RegisterMap {

    private static Map<String, Object> register = new HashMap<>();

    public static RegisterMap getInstance(String name){
        if (name == null) {
            name = RegisterMap.class.getName();
        }
        if (register.get(name) == null) {
            try {
                register.put(name, new RegisterMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);

    }


}
