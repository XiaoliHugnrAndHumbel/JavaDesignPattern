package com.DesignPattern.AbstractFactory.Demo2;

public class Factory2 implements AbstractFactory {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜成长");
        return new Vegetables();
    }
}
