package com.DesignPattern.ThreadState;


/**
 * 线程有新建，就绪，阻塞，允许，死亡几个状态，用状态模式模拟
 */
public class Test {


    public static void main(String[] args) {
        XL_ThreadContext xl_threadContext=new XL_ThreadContext();
        xl_threadContext.changeSate("start");
        xl_threadContext.changeSate("getcpu");
        xl_threadContext.changeSate("suspend");
        xl_threadContext.changeSate("resume");
    }
}
