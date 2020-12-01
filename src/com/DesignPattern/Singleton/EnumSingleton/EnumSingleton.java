package com.DesignPattern.Singleton.EnumSingleton;


/**
 * 枚举单例
 * 可以解决序列化破坏单例的问题
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
