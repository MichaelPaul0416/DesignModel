package com.wq.design.model.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/8 23:13
 * @description:
 */
public class NewYorkBeefPizza extends Pizza {

    public NewYorkBeefPizza(){
        super.name = "纽约牛肉披萨";
        super.dough = "加入牛肉粉的面饼";
        super.sauce = "牛肉酱";
        List<String> toppings = new ArrayList<>();
        toppings.add("牛肉丁");
        toppings.add("墨西哥魔鬼辣椒");
        super.toppings = toppings;
    }

    @Override
    protected void bake() {
        System.out.println("【烘烤阶段】牛肉披萨需要烤制得久一点，需要烤制40分钟");
    }
}
