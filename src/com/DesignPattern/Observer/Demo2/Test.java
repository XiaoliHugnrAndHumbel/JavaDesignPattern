package com.DesignPattern.Observer.Demo2;

/**
 * 观察者模式
 * 通过鼠标点击事件来模拟
 */
public class Test {
    public static void main(String[] args) {
        try{
            MouseEventCallback mouseEventCallback=new MouseEventCallback();

            Mouse mouse=new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK,mouseEventCallback);
            mouse.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
