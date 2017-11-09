package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:20
 * @description:
 */
public class GermanyGlass extends Glass {

    private String describe;

    public GermanyGlass(){
        this.describe = "德国生产的毛玻璃";
    }
    @Override
    public String display() {
        return "【玻璃】-->" + describe;
    }
}
