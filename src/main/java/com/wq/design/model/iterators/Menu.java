package com.wq.design.model.iterators;

import java.util.Iterator;

/**
 * @author: Paul
 * @time:2017/11/20 21:45
 * @description:菜单接口
 */
public interface Menu<T> {
    Iterator<T> createIterator();
}
