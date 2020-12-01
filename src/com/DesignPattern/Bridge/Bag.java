package com.DesignPattern.Bridge;

/**
 * 抽象化角色：包
 */
abstract class Bag {
    protected Color color;
    public void SetColor(Color color){
        this.color=color;
    }
    public  abstract String getName();
}
