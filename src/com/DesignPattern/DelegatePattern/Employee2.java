package com.DesignPattern.DelegatePattern;

public class Employee2 implements IEmployee {
    @Override
    public void doing(String commond) {
        System.out.println("我是员工2，我开始干"+commond+"工作");
    }
}
