package com.lg.pattern.Strategy.payport;

import com.lg.pattern.Strategy.PayState;

public class JDPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用京东白条AliPay");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
