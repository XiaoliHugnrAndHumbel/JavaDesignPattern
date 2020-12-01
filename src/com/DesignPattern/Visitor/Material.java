package com.DesignPattern.Visitor;

/**
 * 抽象元素：材料
 */
interface Material {
    String accept(Company visitor);
}
