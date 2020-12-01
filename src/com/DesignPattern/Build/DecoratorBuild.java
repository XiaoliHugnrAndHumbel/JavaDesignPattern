package com.DesignPattern.Build;


/**
 * 抽象建造者：装修工人
 */
abstract class DecoratorBuild {
    //创建产品对象
    protected Parlour parlour=new Parlour();
    public abstract void BuildWall();
    public abstract void BuildTV();
    public abstract void BuildSofe();
    //返回产品对象
    public Parlour result(){
        return parlour;
    }
}
