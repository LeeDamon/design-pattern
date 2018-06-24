package com.lg.pattern.factory.func;

import com.lg.pattern.factory.Milk;
import com.lg.pattern.factory.Telunsu;
import com.lg.pattern.factory.Yili;

public class TelunsuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
