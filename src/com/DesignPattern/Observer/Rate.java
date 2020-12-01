package com.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标：汇率
 */
abstract class Rate {
    protected List<Company> companies=new ArrayList<Company>();

    public void add(Company company){
        companies.add(company);
    }
    public void remove(Company company){
        companies.remove(company);
    }
    public  abstract void change(int number);
}
