package com.DesignPattern.AbstractFactory.Demo2;

public class Factory1 implements AbstractFactory {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果成长");
        return new Fruit();
    }
}
