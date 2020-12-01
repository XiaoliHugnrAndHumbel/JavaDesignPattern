package com.DesignPattern.DelegatePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目经理自己不干活，负责任务的分发
 */
public class Leader implements IEmployee {
    private Map<String,IEmployee> target=new HashMap<>();

    public Leader(){
        target.put("加密",new Employee1());
        target.put("登录",new Employee2());
    }

    @Override
    public void doing(String commond) {
        target.get(commond).doing(commond);
    }
}
