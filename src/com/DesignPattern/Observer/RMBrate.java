package com.DesignPattern.Observer;


/**
 * 具体目标，人名币汇率
 */
public class RMBrate extends Rate {
    @Override
    public void change(int number) {
        for(Company c:companies){
        c.response(number);
        }
    }
}
