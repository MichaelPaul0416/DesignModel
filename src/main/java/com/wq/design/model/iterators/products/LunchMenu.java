package com.wq.design.model.iterators.products;

import com.wq.design.model.iterators.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/20 22:23
 * @description:
 */
public class LunchMenu implements Menu<Food>{

    private List<Food> lunchList;

    private String name;

    private String description;

    public LunchMenu(String name,String description){
        this.name = name;
        this.description = description;
        lunchList = new ArrayList<>();
        lunchList.add(new BeefRiceLunch("牛肉炒饭","伊斯兰教的炒饭",12.6));
        lunchList.add(new HamburgerLunch("汉堡套餐","比KFC更便宜更划算",16));
        lunchList.add(new ChickenLunch("炸鸡","童子鸡噢",10));
    }

    @Override
    public Iterator<Food> createIterator() {
        return lunchList.iterator();
    }
}
