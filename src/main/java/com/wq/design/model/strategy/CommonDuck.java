package com.wq.design.model.strategy;

import com.wq.design.model.strategy.attributes.*;

/**
 * @author: wangqiang20995
 * @datetime: 2017/10/28 0:27
 * @description:
 * @Reources:
 */
public class CommonDuck extends AbstractDuck{

    public CommonDuck(){
        super();
    }

    public CommonDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(flyBehavior,quackBehavior);
    }

    @Override
    protected void display() {
        System.out.println("我是一只正常的鸭子，活的。下面开始介绍我自己");
        performFly();
        performQuack();
    }

    public static void main(String args[]){
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new DuckQuack();
        AbstractDuck commonDuck = new CommonDuck(flyBehavior,quackBehavior);
        commonDuck.display();
        System.out.println("活的鸭子要更新了");
        QuackBehavior modelDuckQuack = new ModelDuckQuack();
        commonDuck.setQuackBehavior(modelDuckQuack);
        commonDuck.display();
    }
}
