package com.DesignPattern.AbstractFactory.Demo1;

import com.DesignPattern.AbstractFactory.Demo1.Animal;

public class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("小马show");
    }
}
