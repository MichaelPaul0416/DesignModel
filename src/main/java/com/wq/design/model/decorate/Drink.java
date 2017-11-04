package com.wq.design.model.decorate;

/**
 * @author: Paul
 * @time:2017/11/4 0:28
 * @description:装饰者的抽象
 */
public interface Drink {

    int TALL = 1;

    int GRANDE = 2;

    int VENTI = 3;

    double cost();

    int getSize();
}
