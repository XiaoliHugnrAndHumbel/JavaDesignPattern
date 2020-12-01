package com.DesignPattern.ThreadState2;

public class Runable extends ThreadState {
     Runable(){
     statename="就绪状态";
     System.out.println("当前线程处于"+statename);
    }
    public void getCPU(ThreadContext hj) {
        System.out.print("获得CPU时间-->");
        if (statename.equals("就绪状态")) {
            hj.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}
