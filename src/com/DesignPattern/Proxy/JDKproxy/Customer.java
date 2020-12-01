package com.DesignPattern.Proxy.JDKproxy;


/**
 *被代理类：单身人士
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180");
        System.out.println("有6块腹肌");
    }
}
