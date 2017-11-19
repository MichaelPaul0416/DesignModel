package com.wq.design.model.template;

/**
 * @author: Paul
 * @time:2017/11/19 10:40
 * @description:
 */
public class TemplateDemo {
    public static void main(String args[]){
        AbstractDrinkTemplate lemonDrink = new LemonDrink();
        lemonDrink.readyDrink();
    }
}
