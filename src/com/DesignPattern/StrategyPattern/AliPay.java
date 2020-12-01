package com.DesignPattern.StrategyPattern;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
