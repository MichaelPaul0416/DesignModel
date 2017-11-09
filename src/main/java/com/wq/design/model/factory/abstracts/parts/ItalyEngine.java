package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:16
 * @description:
 */
public class ItalyEngine extends Engine {
    private String describe;

    public ItalyEngine(){
        this.describe = "法拉利公司生产的赛车引擎";
    }
    @Override
    public String display() {
        return "【引擎】-->" + describe;
    }
}
