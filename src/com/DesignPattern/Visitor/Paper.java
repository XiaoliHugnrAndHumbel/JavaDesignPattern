package com.DesignPattern.Visitor;

/**
 * 具体元素：纸
 */
public class Paper implements Material {
    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
