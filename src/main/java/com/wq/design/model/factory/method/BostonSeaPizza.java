package com.wq.design.model.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/8 23:16
 * @description:
 */
public class BostonSeaPizza extends Pizza {

    public BostonSeaPizza(){
        super.name = "波士顿海鲜风味披萨";
        super.dough = "又薄又软的面饼";
        super.sauce = "海鲜酱";
        List<String> toppings = new ArrayList<>();
        toppings.add("虾仁");
        toppings.add("三文鱼");
        super.toppings = toppings;
    }
}
