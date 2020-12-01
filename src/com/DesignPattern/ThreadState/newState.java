package com.DesignPattern.ThreadState;

public class newState extends Xl_AbstractThreadState {
    newState(XL_ThreadContext xl_threadContext){
        threadContext=xl_threadContext;
        statename="新建";
        methodname="";
    }

    newState(Xl_AbstractThreadState state){
        threadContext=state.threadContext;
        statename="新建";
    }

    @Override
    void run() {

        if (methodname.equals("start")){
                threadContext.Setstate(new readState(this));
        }
    }
}
