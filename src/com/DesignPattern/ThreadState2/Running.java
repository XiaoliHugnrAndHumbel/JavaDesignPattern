package com.DesignPattern.ThreadState2;

public class Running extends ThreadState {
    public Running() {
        statename = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }
    public void suspend(ThreadContext hj) {
        System.out.print("调用suspend()方法-->");
        if (statename.equals("运行状态")) {
            hj.setState(new Block());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }
    public void stop(ThreadContext hj) {
        System.out.print("调用stop()方法-->");
        if (statename.equals("运行状态")) {
            hj.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}
