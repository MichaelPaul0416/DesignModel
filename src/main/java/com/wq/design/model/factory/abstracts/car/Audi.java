package com.wq.design.model.factory.abstracts.car;

import com.wq.design.model.factory.abstracts.company.MaterialFactory;

/**
 * @author: Paul
 * @time:2017/11/9 23:39
 * @description:
 */
public class Audi extends Car{
    private MaterialFactory factory;

    public Audi(MaterialFactory factory){
        this.factory = factory;
        this.name = "奥迪A7";
        //这些事情应该在汽车生产厂里就做完了
        this.assemble();
        super.check();
        super.information();
    }

    @Override
    public void assemble() {
        System.out.println("开始给车【"+name+"】进行组装");
        super.engine = factory.createEngine();
        super.wheel = factory.createWheel();
        super.glass = factory.createGlass();
    }
}
