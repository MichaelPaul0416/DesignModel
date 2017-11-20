package com.wq.design.model.iterators;

import com.wq.design.model.iterators.products.Food;

import java.util.Iterator;

/**
 * @author: Paul
 * @time:2017/11/20 22:34
 * @description:
 */
public class Waitress {
    private String name;

    private Menu<Food> breaks;

    private Menu<Food> lunch;

    public Waitress(Menu<Food> breaks,Menu<Food> lunch){
        this.breaks = breaks;
        this.lunch = lunch;
        this.name = "Tim";
    }

    public void showMenu(){
        Iterator<Food> breakIterator = breaks.createIterator();
        Iterator<Food> lunchIterator = lunch.createIterator();
        System.out.println("=================早餐菜单=================");
        int index = 1;
        while(breakIterator.hasNext()){
            Food food = breakIterator.next();
            System.out.println(String.format("早餐【%s】：【%s】",index,food));
            index ++;
        }

        index = 1;
        System.out.println("=================午饭菜单=================");
        while (lunchIterator.hasNext()){
            Food food = lunchIterator.next();
            System.out.println(String.format("午餐【%s】：【%s】",index,food));
            index ++;
        }

    }
}
