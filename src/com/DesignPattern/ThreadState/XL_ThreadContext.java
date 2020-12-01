package com.DesignPattern.ThreadState;

public class XL_ThreadContext {
    private Xl_AbstractThreadState abstractThreadState;
    XL_ThreadContext(){
        abstractThreadState=new newState(this);
    }

    public void Setstate(Xl_AbstractThreadState state){
        abstractThreadState=state;
    }

    public Xl_AbstractThreadState getContext(){
        return abstractThreadState;
    }

    void changeSate(String methodname){
        abstractThreadState.changeState(methodname);
    }

}
