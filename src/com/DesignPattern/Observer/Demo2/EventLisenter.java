package com.DesignPattern.Observer.Demo2;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，他是观察者的桥梁
 */
public class EventLisenter {
    //jdk底层的Lisenter通常也是这样设计的
    protected Map<String,Event> events=new HashMap<>();

    //通过事件名称和一个目标对象来触发事件
    public void addLisenter(String eventType,Object target){
        try{
            this.addLisenter(eventType,target,target.getClass().getMethod("on"+toUpperFirstCase(eventType),Event.class));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    //注册时间
    public void addLisenter(String eventType, Object target, Method callback){
        events.put(eventType,new Event(target,callback));
    }
    //触发，只要有动作就会触发
    private void trigger(Event event){
        event.setSources(this);
        event.setTime(System.currentTimeMillis());
        try{
            //发起回调
            if (event.getCallback()!=null){
                //用反射调用它的回调函数
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //事件名称触发
    protected  void trigger(String eventname){
        if (!this.events.containsKey(eventname)){ return;}
        Event event=this.events.get(eventname);
        event.setTrigger(eventname);
        trigger(event);
    }
    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str){
    char[] chars=str.toCharArray();
    chars[0]-=32;
    return String.valueOf(chars);
    }
}
