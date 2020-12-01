package com.DesignPattern.Bridge;

/**
 * 扩展抽象化角色：钱包
 */
public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor()+"Wallet";
    }
}
