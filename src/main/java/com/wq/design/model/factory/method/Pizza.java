package com.wq.design.model.factory.method;

import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/8 22:58
 * @description:工厂方法
 */
public abstract class Pizza {
    protected String name;//Pizza名称
    protected String dough;//面团类型
    protected String sauce;//酱料类型
    protected List<String> toppings;//佐料

    protected void prepare(){
        System.out.println("【准备阶段】准备生产Pizza-->"+name);
        System.out.println("【准备阶段】使用面团类型-->"+dough);
        System.out.println("【准备阶段】使用酱料类型-->"+sauce);
        System.out.println("【准备阶段】准备添加佐料-->"+toppings);
    }

    protected void bake(){
        System.out.println("【烘烤阶段】需要Pizza烘烤25-30分钟");
    }


    protected void cut(){
        System.out.println("【切片阶段】默认将Pizza切成8片");
    }

    protected void box(){
        System.out.println("【装箱阶段】将切好的Pizza装入常规的箱子");
    }

}
