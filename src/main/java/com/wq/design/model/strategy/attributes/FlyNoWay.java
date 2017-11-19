package com.wq.design.model.strategy.attributes;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:21
 * @description:
 * @Reources:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("没翅膀，也没有其他可以用来飞的东西，所以现在飞不起来");
    }
}
