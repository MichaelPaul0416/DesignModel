package com.wq.design.model.adapter;

/**
 * @Author: wangqiang20995
 * @Date:2017/11/18
 * @DEscription:
 * @Resource:
 */
public class MobilePlug implements DoublePlug {
    private String name;
    public MobilePlug(String name){
        this.name = name;
    }
    @Override
    public void work() {
        System.out.println(String.format("手机[%s]使用两脚插头进行手机充电",this.name));
    }
}
