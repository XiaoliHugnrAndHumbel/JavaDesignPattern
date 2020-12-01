package com.DesignPattern.AbstractFactory.Demo1;

import com.DesignPattern.AbstractFactory.Demo1.AbstractFactory;
import com.DesignPattern.AbstractFactory.Demo1.Animal;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println("工厂方法模式测试");
            Animal a;
            AbstractFactory af;
            String fName="com.DesignPattern.AbstractFactory.CattleFarm";
            Class<?> c=Class.forName(fName);
            Object obj=c.newInstance();
            af=(AbstractFactory)obj;
            a=af.newAnimal();
            a.show();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
