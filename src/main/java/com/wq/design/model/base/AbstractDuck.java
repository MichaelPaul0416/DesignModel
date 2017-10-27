package com.wq.design.model.base;

import com.wq.design.model.base.attributes.FlyBehavior;
import com.wq.design.model.base.attributes.QuackBehavior;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:13
 * @description:鸭子的祖宗类
 * @Reources:
 */
public abstract class AbstractDuck {
    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public AbstractDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public AbstractDuck(){}

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void lifeCycle(){
        System.out.println("所有的鸭子都有一个生命周期");
    }

    protected abstract void display();
}
