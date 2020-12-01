package com.DesignPattern.ThreadState;

public class blockState extends Xl_AbstractThreadState {
    blockState(Xl_AbstractThreadState state){
        threadContext=state.threadContext;
        statename="阻塞";
        System.out.println("切换到了"+statename+"状态");
    }
    @Override
    void run() {
        if (methodname.equals("resume")){
            threadContext.Setstate(new readState(this));
        }
    }
}
