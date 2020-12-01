package com.DesignPattern.AbstractFactory.Demo1;

import com.DesignPattern.AbstractFactory.Demo1.Animal;

public class Cattle implements Animal {

    @Override
    public void show() {
        System.out.println("小牛show");
    }
}
