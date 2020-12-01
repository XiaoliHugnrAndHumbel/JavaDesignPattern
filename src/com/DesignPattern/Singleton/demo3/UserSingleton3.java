package com.DesignPattern.Singleton.demo3;

//最好的单例模式实现方式
//即解决饿汉加载的空间问题
//又解决懒汉加载synchronized的性能问题
public class UserSingleton3 {
    //使用UserSingleton3的时候，默认会先初始化内部类
    //如果没使用，则内部类是不加载的
    private UserSingleton3(){
        if (getInstanceTemp.user!=null){

            throw new RuntimeException("不允许创建多个实例");
        }
    }
    //每一个关键字都不是多余的，static是为了使单例的空间共享，保证这个方法不会被重写，重载
    public static final UserSingleton3 getInstance(){
        //在放回结果之前，一定会先加载内部类
        return getInstanceTemp.user;
    }
    //默认不加载
    private static class getInstanceTemp{
        private static final UserSingleton3 user=new UserSingleton3();
    }
}
