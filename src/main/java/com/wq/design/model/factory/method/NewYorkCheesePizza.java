package com.wq.design.model.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/8 23:09
 * @description:
 */
public class NewYorkCheesePizza extends Pizza {

    public NewYorkCheesePizza(){
        super.name = "纽约奶酪风味披萨";
        super.dough = "薄面饼";
        super.sauce = "酸辣酱";
        List<String> toppings = new ArrayList<>();
        toppings.add("虾皮");
        toppings.add("牛肉");
        toppings.add("干奶酪");
        super.toppings = toppings;
    }

    @Override
    protected void cut() {
        System.out.println("【切片阶段】纽约人喜欢吃的小份一点的，所以披萨需要被切成16份");
    }
}
