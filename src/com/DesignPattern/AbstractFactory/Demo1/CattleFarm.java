package com.DesignPattern.AbstractFactory.Demo1;

import com.DesignPattern.AbstractFactory.Demo1.AbstractFactory;
import com.DesignPattern.AbstractFactory.Demo1.Animal;
import com.DesignPattern.AbstractFactory.Demo1.Cattle;

public class CattleFarm implements AbstractFactory {
    @Override
    public Animal newAnimal() {
        System.out.println("新生成一头小牛");
        return new Cattle();
    }
}
