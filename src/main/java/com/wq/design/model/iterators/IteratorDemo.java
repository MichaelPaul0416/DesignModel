package com.wq.design.model.iterators;

import com.wq.design.model.iterators.products.Food;
import com.wq.design.model.iterators.products.LunchMenu;

/**
 * @author: Paul
 * @time:2017/11/19 19:45
 * @description:
 */
public class IteratorDemo {
    public static void main(String args[]){
        Menu<Food> breaks = new BreakfastMenu("今天刚推出的新品早餐","今日早餐");
        Menu<Food> lunch = new LunchMenu("中外口味都有的快餐","实惠快餐");
        Waitress waitress = new Waitress(breaks,lunch);
        waitress.showMenu();
    }
}
