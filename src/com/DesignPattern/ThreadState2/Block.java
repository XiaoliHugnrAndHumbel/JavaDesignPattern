package com.DesignPattern.ThreadState2;

public class Block extends ThreadState {
    public Block() {
        statename = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }
    public void resume(ThreadContext hj) {
        System.out.print("调用resume()方法-->");
        if (statename.equals("阻塞状态")) {
            hj.setState(new Runable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
