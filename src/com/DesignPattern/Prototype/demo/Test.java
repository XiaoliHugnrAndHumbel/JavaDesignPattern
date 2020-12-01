package com.DesignPattern.Prototype.demo;

/**
 * 原型模式
 */
public class Test {
    public static void main(String[] args) {
        UserPrototype user1=new UserPrototype();
        UserPrototype user2= (UserPrototype) user1.clone();
        if (user1==user2){
            System.out.println("user1==user2:  true");
        }else {
            System.out.println("user1==user2:  false");
        }
        

    }
}
