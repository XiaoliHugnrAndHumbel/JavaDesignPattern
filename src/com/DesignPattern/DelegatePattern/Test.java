package com.DesignPattern.DelegatePattern;

/**
 * 委派模式
 */
public class Test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.commond("加密",new Leader());
    }
}
