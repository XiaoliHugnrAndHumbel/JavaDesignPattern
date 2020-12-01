package com.DesignPattern.ThreadState;

public class DeadState extends Xl_AbstractThreadState{
    DeadState(Xl_AbstractThreadState state){
        threadContext=state.threadContext;
        statename="死亡";
        System.out.println("切换到了"+statename+"状态");
    }
    @Override
    void run() {
        System.out.println("切换到了"+statename+"状态");
    }
}
