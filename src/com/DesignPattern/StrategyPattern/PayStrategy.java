package com.DesignPattern.StrategyPattern;

import java.util.HashMap;
import java.util.Map;


/**
 * 支付策略管理类
 */
public class PayStrategy {
    public static final String ALI_PAY="AliPay";
    public static final String JD_PAY="JdPay";
    public static final String UNION_PAY="UnionPay";
    public static final String WECHAT_PAY="WechatPay";
    public static final String DEFAULT_PAY="ALI_PAY";

    private static Map<String,Payment> payStrategy=new HashMap<>();

    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
    }
    public static Payment get(String paykey){
        if (!payStrategy.containsKey(paykey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(paykey);
    }
}
