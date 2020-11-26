package com.DesignPattern.Singleton.demo2;

public class UserSingleton2 {
    private static UserSingleton2 instance=new UserSingleton2();
    private UserSingleton2(){
        System.out.println("初始化");
    }
    public static UserSingleton2 getInstance(){
        return instance;
    }
    public void getName(){
        System.out.println("我叫小明");
    }
}
