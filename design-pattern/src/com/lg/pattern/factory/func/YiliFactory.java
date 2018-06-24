package com.lg.pattern.factory.func;

import com.lg.pattern.factory.Milk;
import com.lg.pattern.factory.Yili;

public class YiliFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
