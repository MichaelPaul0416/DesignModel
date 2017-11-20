package com.wq.design.model.iterators;

import com.wq.design.model.iterators.products.*;

import java.util.Iterator;

/**
 * @author: Paul
 * @time:2017/11/20 21:47
 * @description:早餐菜单
 */
public class BreakfastMenu implements Menu<Food> {

    private Food[] menus;

    private String description;

    private String name;

    private int position;//记录迭代的次数

    public BreakfastMenu(String description,String name){
        this.name = name;
        this.description = description;
        menus = new Food[]{
                new SoyBeanBreak("豆浆","鲜榨豆浆",2.3),
                new NoodlesBreak("拌面","手擀面和新鲜酱料",5.0),
                new DumplingBreak("包子","天津狗不理包子",2.0)
        };
    }

    private class BreakIterator implements Iterator<Food>{
        @Override
        public boolean hasNext() {
            boolean flag = false;
            if(menus != null && position < menus.length){
                Food temp = menus[position];
                if(temp != null && !(temp instanceof NullFood)){
                    flag = true;
                }else{
                    System.out.println(String.format("索引【%s】上食品不存在",position));
                }
            }else {
                System.out.println(String.format("索引【%s】项在菜单中不存在",position));
            }
            return flag;
        }

        @Override
        public Food next() {
            if(hasNext()){
                Food temp = menus[position];
                position ++;
                return temp;
            }
            return null;
        }
    }


    @Override
    public Iterator<Food> createIterator() {
        return new BreakIterator();
    }
}
