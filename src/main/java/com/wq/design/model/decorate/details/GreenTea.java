package com.wq.design.model.decorate.details;

import com.wq.design.model.decorate.Drink;

/**
 * @author: Paul
 * @time:2017/11/4 0:29
 * @description:绿茶
 */
public class GreenTea implements Drink {

    private String description;

    private int size;

    public GreenTea(String description,int size){
        this.description = description;
        this.size = size;
    }

    public double cost() {
        System.out.println("订购了一份【"+description+"】，单价是【"+3.2+"】");
        return 3.2;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
