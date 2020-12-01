package com.DesignPattern.Bridge;

/**
 * 桥接模式
 */
public class Test {
    public static void main(String[] args) {
        Color color=new Red();
        Bag bag=new HandBag();
        bag.SetColor(color);
        String bagname=bag.getName();
        System.out.println(bagname);
    }
}
