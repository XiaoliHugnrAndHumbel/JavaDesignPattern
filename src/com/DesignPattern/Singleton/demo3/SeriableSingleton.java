package com.DesignPattern.Singleton.demo3;

import java.io.Serializable;
//序列化会破坏单例
public class SeriableSingleton implements Serializable {
public final static SeriableSingleton INSTANCE=new SeriableSingleton();
private SeriableSingleton(){

}
public static SeriableSingleton getInstance(){
    return INSTANCE;
}

//实现readResolve，解决序列化会破坏单例
public Object readResolve(){
    return INSTANCE;
}

}
