package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:23
 * @description:
 */
public class ItalyWheel extends Wheel {
    private String describe;

    public ItalyWheel(){
        this.describe = "意大利产的F1赛事专用轮胎";
    }

    @Override
    public String display() {
        return "【轮胎】-->" + this.describe;
    }
}
