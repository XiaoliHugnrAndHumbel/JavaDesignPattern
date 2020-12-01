package com.DesignPattern.Prototype.demo;

public class UserPrototype implements Cloneable {
    private static final long uuid=5543049531872119328L;
    public Object clone(){
        UserPrototype user=null;
        try{
            user=(UserPrototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return user;
    }
}
