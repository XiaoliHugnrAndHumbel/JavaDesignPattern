package com.DesignPattern.State;

/**
 * 状态模式
 */
public class Test {
    public static void main(String[] args) {
        ScoreContext scoreContext=new ScoreContext();
        scoreContext.add(80);
        scoreContext.add(95);
    }
}
