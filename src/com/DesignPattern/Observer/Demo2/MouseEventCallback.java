package com.DesignPattern.Observer.Demo2;

public class MouseEventCallback {
    public void onClick(Event e){
        System.out.println("触发单击方法---------"+e);
    }
    public void onDoubelclick(Event e){
        System.out.println("触发双击方法---------"+e);
    }
    public void onUp(Event e){
        System.out.println("触发抬起方法---------"+e);
    }
    public void onDown(Event e){
        System.out.println("触发按下方法---------"+e);
    }
    public void onMove(Event e){
        System.out.println("触发移动方法---------"+e);
    }
    public void onWheel(Event e){
        System.out.println("触发滑动方法---------"+e);
    }
    public void onOver(Event e){
        System.out.println("触发悬停方法---------"+e);
    }
    public void onBlur(Event e){
        System.out.println("触发获焦方法---------"+e);
    }
    public void onFocus(Event e){
        System.out.println("触发失焦方法---------"+e       );
    }
}
