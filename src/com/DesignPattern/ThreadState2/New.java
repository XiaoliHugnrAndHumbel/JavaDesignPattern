package com.DesignPattern.ThreadState2;

public class New extends ThreadState {
     New(){
        statename="新建状态";
        System.out.println("当前线程处于"+statename);
    }
    public void start(ThreadContext hj){
        System.out.println("调用start方法");
        if (statename.equals("新建状态")){
            hj.setState(new Runable());
        }else{
            System.out.println("当前线程状态不是新建状态，不能调用start方法");
        }
    }
}
