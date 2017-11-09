package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:07
 * @description:
 */
public class GermanyEngine extends Engine {
    private String describe;
    public GermanyEngine(){
        this.describe = "德国生产的高档汽车引擎";
    }


    @Override
    public String display() {
        return "【引擎】-->" + describe;
    }
}
