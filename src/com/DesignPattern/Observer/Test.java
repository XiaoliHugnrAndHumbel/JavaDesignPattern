package com.DesignPattern.Observer;


/**
 * 观察者模式
 * 设计一个分析人名币汇率的升值或者贬值对公司的影响
 */
public class Test {
    public static void main(String[] args) {
        ExportCompany e=new ExportCompany();
        ImportCompany i=new ImportCompany();
        RMBrate r=new RMBrate();
        r.add(e);
        r.add(i);
        r.change(5);
    }
}
