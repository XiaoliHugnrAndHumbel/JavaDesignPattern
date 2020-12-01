package com.DesignPattern.Build;

/**
 * 指挥者：项目经理
 */
public class ProjectManager {
    private DecoratorBuild build;
    public ProjectManager(DecoratorBuild build){
        this.build=build;
    }
    //产品构建与组装方法
    public Parlour decorate(){
        build.BuildWall();
        build.BuildSofe();
        build.BuildTV();
        return build.result();
    }
}
