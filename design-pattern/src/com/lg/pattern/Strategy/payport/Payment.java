package com.lg.pattern.Strategy.payport;

import com.lg.pattern.Strategy.PayState;

public interface Payment {

    public PayState pay(String uid, double amount);
}
