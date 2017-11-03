package com.wq.design.model.decorate.details;

import com.wq.design.model.decorate.Drink;

/**
 * @author: Paul
 * @time:2017/11/4 0:31
 * @description:
 */
public class Coffee implements Drink {
    private String description;

    public Coffee(String description){
        this.description = description;
    }
    public double cost() {
        System.out.println("订购了一份【"+description+"】，单价是【"+6.4+"】");
        return 6.4;
    }
}
