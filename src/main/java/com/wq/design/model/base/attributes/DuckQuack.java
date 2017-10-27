package com.wq.design.model.base.attributes;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:23
 * @description:
 * @Reources:
 */
public class DuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("发出了鸭子真实的叫声");
    }
}
