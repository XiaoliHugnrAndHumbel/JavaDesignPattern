package com.DesignPattern.Visitor;

/**
 * 具体访问者：造币公司
 */
public class Mint implements Company {
    @Override
    public String create(Paper paper) {
        System.out.println("纸币");
        return "纸币";
    }

    @Override
    public String create(Cuprum element) {
        System.out.println("铜币");
        return "铜币";
    }
}
