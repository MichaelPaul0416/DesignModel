package com.wq.design.model.factory.abstracts.company;

import com.wq.design.model.factory.abstracts.parts.*;

/**
 * @author: Paul
 * @time:2017/11/9 23:25
 * @description:
 */
public class F1CarFactory implements MaterialFactory {

    public F1CarFactory(){
        System.out.println("F1赛车生产厂商");
    }

    @Override
    public Engine createEngine() {
        return new ItalyEngine();
    }

    @Override
    public Glass createGlass() {
        return new GermanyGlass();
    }

    @Override
    public Wheel createWheel() {
        return new ItalyWheel();
    }
}
