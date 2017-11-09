package com.wq.design.model.factory.abstracts.company;

import com.wq.design.model.factory.abstracts.parts.Engine;
import com.wq.design.model.factory.abstracts.parts.Glass;
import com.wq.design.model.factory.abstracts.parts.Wheel;

/**
 * @author: Paul
 * @time:2017/11/9 23:00
 * @description:抽象原料工厂
 */
public interface MaterialFactory {
    Engine createEngine();//生产引擎

    Glass createGlass();//生产玻璃

    Wheel createWheel();//生产轮子
}
