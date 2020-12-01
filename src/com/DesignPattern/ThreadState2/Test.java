package com.DesignPattern.ThreadState2;

//线程状态切换方法二
public class Test {
    public static void main(String[] args) {
            ThreadContext context=new ThreadContext();
            context.start();
            context.getCPU();
            context.suspend();
            context.resume();
            context.getCPU();
            context.stop();
    }
}
