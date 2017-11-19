package com.wq.design.model.template;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: Paul
 * @time:2017/11/19 10:14
 * @description:抽象模板方法类
 */
public abstract class AbstractDrinkTemplate<T> {

    protected List<T> additions;

    final void readyDrink(){
        additions = new ArrayList<T>();
        boilWater();
        System.out.println("往沸水里添加冲泡的东西");
        put();
        addAddition(additions);
        drink();
        System.out.println("欢迎下次光临");
    }

    protected void boilWater(){
        System.out.println("做饮料总需要烧水的吧");
    }

    protected abstract void put();

    protected abstract void addAddition(@Nullable List<T> list);

    protected boolean consume(){//hook
        return false;
    }

    protected void drink(){
        System.out.println(String.format("给客户做好的饮料[%s]",additions));
        if(consume()){
            System.out.println("打包好饮料，给客户带走喝");
        }else {
            System.out.println("客户要求直接喝，不需要打包");
        }
    }
}
