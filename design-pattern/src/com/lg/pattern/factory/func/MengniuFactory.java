package com.lg.pattern.factory.func;

import com.lg.pattern.factory.Mengniu;
import com.lg.pattern.factory.Milk;

public class MengniuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
