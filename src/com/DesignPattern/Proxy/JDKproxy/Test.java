package com.DesignPattern.Proxy.JDKproxy;

/**
 * jdk动态代理
 * 用婚介所模拟动态代理模式
 */
public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Person person=(Person) new JDKproxy().getInstance(customer);
        person.findLove();

    }
}
