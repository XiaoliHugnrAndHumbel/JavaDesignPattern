package com.DesignPattern.DelegatePattern;

public class Boss {
    public void commond(String commond,Leader leader){
        leader.doing(commond);
    }
}
