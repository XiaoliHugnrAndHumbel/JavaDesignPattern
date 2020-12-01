package com.DesignPattern.Proxy.JDKproxy;

import com.sun.javaws.IconUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKproxy implements InvocationHandler {
    //被代理对象
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Before();
        Object obj=method.invoke(this.target,args);
        After();
        return null;
    }

    //在代理事件之前执行
    private void Before(){
        System.out.println("婚介所向你确认需求");
    }
    //在代理事件之后执行
    private void After(){
        System.out.println("成功找到");
    }
}
