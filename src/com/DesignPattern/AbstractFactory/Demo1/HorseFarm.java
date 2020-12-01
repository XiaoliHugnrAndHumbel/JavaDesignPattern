package com.DesignPattern.AbstractFactory.Demo1;

import com.DesignPattern.AbstractFactory.Demo1.AbstractFactory;
import com.DesignPattern.AbstractFactory.Demo1.Animal;
import com.DesignPattern.AbstractFactory.Demo1.Horse;

public class HorseFarm implements AbstractFactory {
    @Override
    public Animal newAnimal() {
        System.out.println("新生成一头小马");
        return new Horse();
    }
}
