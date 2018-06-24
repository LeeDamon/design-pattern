package com.lg.pattern.factory.simple;

import com.lg.pattern.factory.Mengniu;
import com.lg.pattern.factory.Milk;
import com.lg.pattern.factory.Telunsu;
import com.lg.pattern.factory.Yili;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if (name.equals("tlunsu")){
            return new Telunsu();
        }else if (name.equals("Yili")){
            return new Yili();
        }else{
            return new Mengniu();
        }
    }

}
