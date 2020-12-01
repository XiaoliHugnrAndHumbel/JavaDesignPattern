package com.DesignPattern.ThreadState;

public class readState extends Xl_AbstractThreadState {

    readState(Xl_AbstractThreadState state){
        threadContext=state.threadContext;
        statename="就绪";
        System.out.println("切换到了"+statename+"状态");
    }

    @Override
    void run() {
        if (methodname.equals("getcpu")){
            threadContext.Setstate(new runstate(this));
        }
    }
}
