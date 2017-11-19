package com.wq.design.model.strategy.attributes;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:20
 * @description:
 * @Reources:
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("有翅膀，所以可以飞");
    }
}
