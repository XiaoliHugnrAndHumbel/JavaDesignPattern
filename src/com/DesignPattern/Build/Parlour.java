package com.DesignPattern.Build;


/**
 * 产品：客厅
 */
public class Parlour {
    private String Wall;//墙
    private String TV;//电视
    private String sofa;//沙发
    public void setWall(String wall) {
        Wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show(){
        System.out.println("客厅专修了"+Wall+TV+sofa);
    }
}
