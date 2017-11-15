package com.wq.design.model.command.controls;

/**
 * @author: Paul
 * @time:2017/11/15 22:51
 * @description:
 */
public class Light extends AbstractSubject {
    private String name;

    public Light(String name){
        this.name = name;
    }



    public void open(boolean cancel){
        if(!isSwitchOn() || cancel){
            String prefix = cancel ? "[撤销]" : "";
            System.out.println(prefix + "Light-->["+this+"]被打开了");
            changeState();
        }else {
            System.out.println("Light-->["+this+"]大哥，灯本来就是开着的");
        }
    }

    public void close(boolean cancel){
        if(isSwitchOn() || cancel){
            String prefix = cancel ? "[撤销]" : "";
            System.out.println(prefix + "Light-->["+this+"]被关上了");
            changeState();
        }else {
            System.out.println("Light-->["+this+"]大哥，这个灯本来就是关着的");
        }
    }

    @Override
    public String toString() {
        return "Light{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
