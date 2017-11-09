package com.wq.design.model.factory.abstracts.parts;

import com.wq.design.model.factory.abstracts.Describe;

/**
 * @author: Paul
 * @time:2017/11/9 23:03
 * @description:
 */
public abstract class Glass implements Describe{

    @Override
    public String toString(){
        return display();
    }
}
