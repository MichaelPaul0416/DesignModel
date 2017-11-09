package com.wq.design.model.factory.abstracts.car;

import com.wq.design.model.factory.abstracts.parts.Engine;
import com.wq.design.model.factory.abstracts.parts.Glass;
import com.wq.design.model.factory.abstracts.parts.Wheel;

/**
 * @author: Paul
 * @time:2017/11/9 23:30
 * @description:
 */
public abstract class Car {

    Engine engine;

    Glass glass;

    Wheel wheel;

    String name;

    public abstract void assemble();

    public void check(){
        System.out.println("给车【"+name+"】进行出厂车检");
    }

    public void information(){
        System.out.println("给车【"+name+"】进行信息入库");
    }

    @Override
    public String toString() {
        return "汽车【"+name+"】,使用部件{"+engine+"，"+glass+"，"+wheel+"}";
    }
}
