package com.DesignPattern.ThreadState2;

public class Dead extends ThreadState {
    public Dead() {
        statename = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
