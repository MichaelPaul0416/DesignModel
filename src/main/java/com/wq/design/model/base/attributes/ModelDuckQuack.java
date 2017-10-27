package com.wq.design.model.base.attributes;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:24
 * @description:
 * @Reources:
 */
public class ModelDuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("模型鸭子现在也不会叫");
    }
}
