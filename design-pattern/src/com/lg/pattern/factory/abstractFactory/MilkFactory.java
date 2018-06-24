package com.lg.pattern.factory.abstractFactory;

import com.lg.pattern.factory.Mengniu;
import com.lg.pattern.factory.Milk;
import com.lg.pattern.factory.Telunsu;
import com.lg.pattern.factory.Yili;

public class MilkFactory implements AbstractFactory{

    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
