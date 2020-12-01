package com.DesignPattern.Observer.Demo2;

public class Mouse extends EventLisenter {
    public void click(){
        System.out.println("触发单击方法");
        trigger(MouseEventType.ON_CLICK);
    }
    public void doubelclick(){
        System.out.println("触发双击方法");
        trigger(MouseEventType.ON_DOUBLE_CLICK);
    }
    public void up(){
        System.out.println("触发抬起方法");
        trigger(MouseEventType.ON_UP);
    }
    public void down(){
        System.out.println("触发按下方法");
        trigger(MouseEventType.ON_DOWN);
    }
    public void move(){
        System.out.println("触发移动方法");
        trigger(MouseEventType.ON_MOVE);
    }
    public void wheel(){
        System.out.println("触发滑动方法");
        trigger(MouseEventType.ON_WHEEL);
    }
    public void over(){
        System.out.println("触发悬停方法");
        trigger(MouseEventType.ON_OVER);
    }
    public void blur(){
        System.out.println("触发获焦方法");
        trigger(MouseEventType.ON_BLUR);
    }
    public void focus(){
        System.out.println("触发失焦方法");
        trigger(MouseEventType.ON_FOCUS);
    }
}
