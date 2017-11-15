package com.wq.design.model.command.controls;

/**
 * @author: Paul
 * @time:2017/11/15 21:43
 * @description:
 */
public class Door extends AbstractSubject{

    private String name;

    public Door(String name){
        this.name = name;
    }

    public void open(boolean cancel){
        if(!isSwitchOn() || cancel) {
            String prefix = cancel ? "[撤销]" : "";
            System.out.println(prefix + "Door-->[" + this + "],正在打开");
            changeState();
        }else {
            System.out.println("Door-->大哥，门已经开了，你要先关了我才能开啊");
        }
    }

    public void close(boolean cancel){
        if(isSwitchOn() || cancel) {//开着的，或者是撤销动作
            String prefix = cancel ? "[撤销]" : "";
            System.out.println(prefix + "Door-->[" + this + "],正在关闭");
            changeState();
        }else {
            System.out.println("Door-->大哥，门已经关了，你得先开了我才能关啊");
        }
    }

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
