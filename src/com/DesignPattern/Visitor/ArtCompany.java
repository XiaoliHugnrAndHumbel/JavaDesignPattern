package com.DesignPattern.Visitor;

/**
 * 具体访问者：艺术公司
 */
public class ArtCompany implements Company {
    @Override
    public String create(Paper element) {
        System.out.println("讲学图");
        return "讲学图";
    }

    @Override
    public String create(Cuprum element) {
        System.out.println("朱熹铜像");
        return "朱熹铜像";
    }
}
