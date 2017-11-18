package com.wq.design.model.adapter;

/**
 * @Author: wangqiang20995
 * @Date:2017/11/18
 * @DEscription:
 * @Resource:
 */
public class NotebookPlug implements ThreePlug {
    private String name;
    public NotebookPlug(String name){
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(String.format("笔记本[%s]需要插上三孔插座才能工作",name));
    }
}
