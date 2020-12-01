package com.DesignPattern.StrategyPattern;

/**
 * 订单类
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;
    public Order(String uid,String orderId,double amount){
        this.uid=uid;
        this.orderId=orderId;
        this.amount=amount;
    }
//完美解决了switch问题，更不需要写if...else if
    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }
    public PayState pay(String paykey){
        Payment payment=PayStrategy.get(paykey);
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额为："+amount+",开始扣款...");
        return payment.pay(uid,amount);
    }
}
