package com.wq.design.model.factory.method;

/**
 * @author: Paul
 * @time:2017/11/8 23:23
 * @description:
 */
public class NewYorkPizzaStore extends PizzaStore {

    public NewYorkPizzaStore(){
        super.setStoreName("纽约披萨总店");
    }

    @Override
    protected Pizza createPizza(String style) {
        if("Cheese".equals(style)){
            return new NewYorkCheesePizza();
        }else if("Beef".equals(style)){
            return new NewYorkBeefPizza();
        }
        return null;
    }
}
