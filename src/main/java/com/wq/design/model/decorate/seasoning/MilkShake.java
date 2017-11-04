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
        if(Drink.TALL == getSize()){
            System.out.println("为饮料增加了小杯分量的奶昔，单价【"+this.price+"】");
        }else if(Drink.GRANDE == getSize()){
            System.out.println("为饮料增加了中杯分量的奶昔，单价【"+(this.price *= 1.2)+"】");
        }else {
            System.out.println("为饮料增加了大杯分量的奶昔，单价【"+(this.price *= 1.6)+"】");
        }

        return drink.cost() + this.price;
    }

    @Override
    public int getSize() {
        return drink.getSize();
    }
}
