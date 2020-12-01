package com.DesignPattern.State;

//抽象状态类
abstract class AbstractState {
    protected ScoreContext hj;//环境
    protected String stateName;//状态名
    protected int score;//分数

    public abstract void CheckState();//检查当前状态

    public void addScore(int x){
        score+=x;
        System.out.println("加上："+x+"分，当前分数："+score);
        CheckState();
        System.out.println("当前状态："+hj.getState().stateName);
    }
}
