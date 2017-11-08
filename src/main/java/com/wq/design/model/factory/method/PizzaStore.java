package com.wq.design.model.factory.method;

/**
 * @author: Paul
 * @time:2017/11/8 23:18
 * @description:
 */
public abstract class PizzaStore {
    private String storeName;

    protected final Pizza orderPizza(String style){
        Pizza pizza = createPizza(style);
        if(pizza != null){
            System.out.println("订单处理完成，"+getStoreName()+"准备开始制作披萨了");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println(getStoreName() + "将披萨【"+pizza.name+"】制作好了");
        }else{
            System.out.println("对不起，您要的披萨现在没法制作，本店不销售这个品种的披萨");
        }
        return pizza;

    }

    protected abstract Pizza createPizza(String style);

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
