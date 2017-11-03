package com.wq.design.model.decorate.seasoning;

import com.wq.design.model.decorate.Drink;

/**
 * @author: Paul
 * @time:2017/11/4 0:38
 * @description:
 */
public class MilkShake implements Drink {
    private Drink drink;
    private double price;

    public MilkShake(Drink drink){
        this.drink = drink;
        this.price = 0.7;
    }
    public double cost() {
        System.out.println("为饮料增加了一份奶昔，单价【"+this.price+"】");
        return drink.cost() + this.price;
    }
}
