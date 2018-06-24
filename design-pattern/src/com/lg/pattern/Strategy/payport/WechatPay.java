package com.lg.pattern.Strategy.payport;

import com.lg.pattern.Strategy.PayState;

public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
