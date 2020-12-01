package com.DesignPattern.Observer.Demo2;

import java.lang.reflect.Method;

public class Event {
    //事件源，事件是由谁发起的，保存起来
    private Object sources;
    //事件触发，要通知谁
    private Object target;
    //事件触发，要做什么动作，回调
    private Method callback;
    //事件的名称，触发什么事件
    private String trigger;
    //事件触发的时间
    private long time;



    public Event(Object target, Method callback){
        this.target=target;
        this.callback=callback;
    }


    public Object getSources() {
        return sources;
    }

    public void setSources(Object sources) {
        this.sources = sources;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Event{" +
                "sources=" + sources +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
