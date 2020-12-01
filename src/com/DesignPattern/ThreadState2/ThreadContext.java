package com.DesignPattern.ThreadState2;

public class ThreadContext {
    private ThreadState state;

    ThreadContext(){
        state=new New();
    }

    public void setState(ThreadState state){
        this.state=state;
    }

    public ThreadState getState(){
        return state;
    }

    public void start(){
        ((New)state).start(this);
    }
    public void getCPU(){
        ((Runable)state).getCPU(this);
    }
    public void suspend(){
        ((Running)state).suspend(this);
    }
    public void stop(){
        ((Running)state).stop(this);
    }
    public void resume(){
        ((Block)state).resume(this);
    }

}
