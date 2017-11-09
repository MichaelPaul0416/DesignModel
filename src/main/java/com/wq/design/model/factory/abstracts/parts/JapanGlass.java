package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:18
 * @description:
 */
public class JapanGlass extends Glass {

    private String describe;

    public JapanGlass(){
        this.describe = "日本生产的钢化防暴玻璃";
    }
    @Override
    public String display() {
        return "【玻璃】-->" + describe;
    }
}
