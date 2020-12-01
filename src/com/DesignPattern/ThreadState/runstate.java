package com.DesignPattern.ThreadState;

public class runstate extends Xl_AbstractThreadState {
    runstate(Xl_AbstractThreadState state){
        threadContext=state.threadContext;
        statename="运行";
        System.out.println("切换到了"+statename+"状态");
    }
    @Override
    void run() {

        if (methodname.equals("stop")){
            threadContext.Setstate(new DeadState(this));
        }
        if (methodname.equals("suspend")){
            threadContext.Setstate(new blockState(this));
        }
    }
}
