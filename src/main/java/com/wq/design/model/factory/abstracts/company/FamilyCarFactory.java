package com.wq.design.model.factory.abstracts.company;

import com.wq.design.model.factory.abstracts.parts.*;

/**
 * @author: Paul
 * @time:2017/11/9 23:27
 * @description:
 */
public class FamilyCarFactory implements MaterialFactory{

    public FamilyCarFactory(){
        System.out.println("私家车生产厂商");
    }
    @Override
    public Engine createEngine() {
        return new GermanyEngine();
    }

    @Override
    public Glass createGlass() {
        return new JapanGlass();
    }

    @Override
    public Wheel createWheel() {
        return new AmericaWheel();
    }
}
