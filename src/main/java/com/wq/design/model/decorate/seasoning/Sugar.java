package com.wq.design.model.decorate.seasoning;

import com.wq.design.model.decorate.Drink;

/**
 * @author: Paul
 * @time:2017/11/4 0:33
 * @description:
 */
public class Sugar implements Drink{
    private Drink drink;

    private double price;
    public Sugar(Drink drink){
        this.drink = drink;
        this.price = 0.4;
    }
    public double cost() {
        System.out.println("为饮料添加了一份糖，单价是【"+this.price+"】");
        return drink.cost() + this.price;
    }
}
