package com.DesignPattern.Singleton.ContainerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 容器单例：用于实例很多的情况下，便于管理
 * 非线程安全的
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }
    private static Map<String,Object> ioc=new ConcurrentHashMap<String,Object>();
    public static Object getBean(String classname){
        synchronized (ioc){
            if (!ioc.containsKey(classname)){
                Object obj=null;
                try{
                    obj=Class.forName(classname).newInstance();
                    ioc.put(classname,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }
            else{
                return ioc.get(classname);
            }
        }
    }
}
