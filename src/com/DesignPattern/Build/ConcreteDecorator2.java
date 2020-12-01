package com.DesignPattern.Build;

public class ConcreteDecorator2 extends DecoratorBuild {
    @Override
    public void BuildWall() {
        parlour.setWall("w2");
    }

    @Override
    public void BuildTV() {
        parlour.setTV("t2");
    }

    @Override
    public void BuildSofe() {
        parlour.setSofa("s2");
    }
}
