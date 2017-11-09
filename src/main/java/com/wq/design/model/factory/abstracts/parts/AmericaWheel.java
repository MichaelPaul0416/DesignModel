package com.wq.design.model.factory.abstracts.parts;

/**
 * @author: Paul
 * @time:2017/11/9 23:21
 * @description:
 */
public class AmericaWheel extends Wheel {
    private String describe;

    public AmericaWheel(){
        this.describe = "美国产的防滑橡胶轮胎";
    }

    @Override
    public String display() {
        return "【轮胎】-->" + this.describe;
    }
}
