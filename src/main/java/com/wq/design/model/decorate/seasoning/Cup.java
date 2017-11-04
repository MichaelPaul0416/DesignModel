package com.wq.design.model.decorate.seasoning;

import com.wq.design.model.decorate.Drink;

/**
 * @author: Paul
 * @time:2017/11/4 10:22
 * @description:
 */
public class Cup implements Drink {
    private Drink drink;
    private double price;

    public Cup(Drink drink){
        this.drink = drink;
    }

    @Override
    public double cost() {
        if(Drink.TALL == getSize()){
            this.price = 1;
            System.out.println("顾客购买了小杯的饮料，杯子以及饮料额外金额【"+this.price+"】");
        }else if(Drink.GRANDE == getSize()){
            this.price = 1.5;
            System.out.println("顾客购买了中杯的饮料，杯子以及饮料额外金额【"+this.price+"】");
        }else {
            this.price = 1.8;
            System.out.println("顾客购买了大杯的饮料，杯子以及饮料额外金额【"+this.price+"】");
        }
        return this.drink.cost() + this.price;
    }

    @Override
    public int getSize() {
        return drink.getSize();
    }
}
