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
        if(Drink.TALL == getSize()){
            System.out.println("为饮料添加了小杯份量糖，单价是【"+this.price+"】");
        }else if(Drink.GRANDE == getSize()){
            System.out.println("为饮料添加了中杯份量糖，单价是【"+(this.price *= 1.2)+"】");
        }else{
            System.out.println("为饮料添加了大杯份量糖，单价是【"+(this.price *= 1.5)+"】");
        }

        return drink.cost() + this.price;
    }

    @Override
    public int getSize() {
        return drink.getSize();
    }
}
