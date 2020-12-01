package com.DesignPattern.Build;


/**
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        try
        {
            DecoratorBuild d;
            String builderName="com.DesignPattern.Build.ConcreteDecorator2";
            Class<?> c=Class.forName(builderName);
            Object obj=c.newInstance();
            ProjectManager p=new ProjectManager((DecoratorBuild)obj);
            Parlour parlour= p.decorate();
            parlour.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
