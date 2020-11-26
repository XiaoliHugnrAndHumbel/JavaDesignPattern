package com.DesignPattern.Singleton.demo2;

public class Test {
    public static void main(String[] args) {
        UserSingleton2 user=UserSingleton2.getInstance();
        user.getName();
        UserSingleton2 user2=UserSingleton2.getInstance();
        user2.getName();
        if (user==user2){
            System.out.println("是同一个人");
        }else{
            System.out.println("不是同一个人");
        }
    }
}
