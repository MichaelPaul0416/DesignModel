package com.wq.design.model.factory.method;

/**
 * @author: Paul
 * @time:2017/11/8 23:27
 * @description:
 */
public class BostonPizzaStore extends PizzaStore {

    public BostonPizzaStore(){
        super.setStoreName("波士顿披萨店");
    }
    @Override
    protected Pizza createPizza(String style) {
        if("Sea".equals(style)){
            return new BostonSeaPizza();
        }
        return null;
    }
}
