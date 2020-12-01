package com.DesignPattern.ThreadState;

abstract class Xl_AbstractThreadState {
    protected XL_ThreadContext threadContext;
    protected String methodname;
    protected String statename;


    abstract void  run();

    public void changeState(String methodname){
        this.methodname=methodname;
        System.out.println("状态"+statename+"执行了"+methodname+"方法");
        run();
    }

}
