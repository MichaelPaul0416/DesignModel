package com.wq.design.model.factory.method;

/**
 * @author: Paul
 * @time:2017/11/8 23:28
 * @description:在这个例子中，Pizza是利用工厂方法生产出来的，但是具体生产的时候，ifelse的逻辑可以优化，也是套用工厂方法
 */
public class Demo {
    public static void main(String args[]){
        PizzaStore pizzaStore;
        System.out.println("Paul想吃纽约奶酪披萨");
        pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("Cheese");
        System.out.println("Jone想吃波士顿海鲜披萨");
        pizzaStore = new BostonPizzaStore();
        pizzaStore.orderPizza("Sea");
    }
}
