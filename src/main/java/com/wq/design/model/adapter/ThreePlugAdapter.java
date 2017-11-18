package com.wq.design.model.adapter;

/**
 * @Author: wangqiang20995
 * @Date:2017/11/18
 * @DEscription:
 * @Resource:
 */
public class ThreePlugAdapter implements ThreePlug {
    private DoublePlug doublePlug;
    public ThreePlugAdapter(DoublePlug doublePlug){
        this.doublePlug = doublePlug;
    }
    @Override
    public void work() {
        System.out.println(String.format("适配器将三脚插座转换成两脚插座，进行使用"));
        doublePlug.work();
    }
}
