package com.DesignPattern.StrategyPattern;

/**
 * 策略模式
 * 模拟支付时选择多种支付方式：支付宝，微信。。。
 */
public class Test {


    public static void main(String[] args) {
        //下单
        Order order=new Order("1","202012011538",324.25);
        //开始支付，可以选择支付宝支付，微信支付，银联支付，京东支付
        //每个渠道的支付的具体算法不一样，基本算法是固定的
        //在支付的时候选择用哪个方式支付
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
