package com.DesignPattern.Visitor;

/**
 * 访问者模式
 * 模拟艺术公司与造币公司的功能
 * 分析：艺术公司利用“铜”可以设计出铜像，利用“纸”可以画出图画；造币公司利用“铜”可以印出铜币，利用“纸”可以印出纸币
 * 对“铜”和“纸”这两种元素，两个公司的处理方法不同，所以该实例用访问者模式来实现比较适合
 */
public class Test {
    public static void main(String[] args) {
        SetMaterial material=new SetMaterial();
        material.add(new Paper());
        material.add(new Cuprum());
        material.accept(new ArtCompany());
    }
}
