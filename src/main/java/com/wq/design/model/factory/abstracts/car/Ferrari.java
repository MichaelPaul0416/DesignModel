package com.wq.design.model.factory.abstracts.car;

import com.wq.design.model.factory.abstracts.company.MaterialFactory;

/**
 * @author: Paul
 * @time:2017/11/9 23:35
 * @description:
 */
public class Ferrari extends Car {
    private MaterialFactory factory;

    public Ferrari(MaterialFactory factory){
        this.factory = factory;
        super.name = "法拉利488";
    }

    @Override
    public void assemble() {
        System.out.println("开始给车【"+name+"】进行组装");
        super.engine = factory.createEngine();
        super.glass = factory.createGlass();
        super.wheel = factory.createWheel();
    }
}
