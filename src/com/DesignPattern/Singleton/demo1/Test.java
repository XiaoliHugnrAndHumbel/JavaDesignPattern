package com.DesignPattern.Singleton.demo1;

public class Test {
    public static void main(String[] args) {
        UserSingleton user=UserSingleton.getInstance();
        user.getName();
        UserSingleton user2=UserSingleton.getInstance();
        user2.getName();
        if (user==user2){
            System.out.println("是同一个人");
        }
        else{
            System.out.println("不是同一个人");
        }
    }
}
