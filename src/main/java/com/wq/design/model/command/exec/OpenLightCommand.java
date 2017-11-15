package com.wq.design.model.command.exec;

import com.wq.design.model.command.controls.Light;

/**
 * @author: Paul
 * @time:2017/11/15 23:07
 * @description:
 */
public class OpenLightCommand implements ICommand {
    private Light light;
    public OpenLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.open(false);
    }

    @Override
    public void cancel() {
        System.out.println("["+light+"]接受到撤销命令，开始执行下列撤销动作");
        light.open(true);
    }
}
