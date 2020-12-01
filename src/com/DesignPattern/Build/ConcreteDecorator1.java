package com.DesignPattern.Build;

/**
 * 具体建造者：具体装修工人
 */
public class ConcreteDecorator1 extends DecoratorBuild {
    @Override
    public void BuildWall() {
        parlour.setWall("w1");
    }

    @Override
    public void BuildTV() {
        parlour.setTV("tv1");
    }

    @Override
    public void BuildSofe() {
        parlour.setSofa("sf1");
    }
}
