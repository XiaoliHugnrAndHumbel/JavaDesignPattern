package com.DesignPattern.Singleton.demo1;

public class UserSingleton {
    private static volatile UserSingleton instance=null;//volatile关键字保证线程同步
    private UserSingleton(){//private  禁止外部实例化
        System.out.println("取一个名字");
    }
    public static  synchronized  UserSingleton getInstance(){
        if (instance==null){
            instance=new UserSingleton();
        }else{
            System.out.println("已经有名字了，不能另取了");
        }
        return  instance;
    }
    public void getName(){
        System.out.println("取名叫小明");
    }

}
