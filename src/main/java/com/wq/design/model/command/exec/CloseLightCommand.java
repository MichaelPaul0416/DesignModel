package com.wq.design.model.command.exec;

import com.wq.design.model.command.controls.Light;

/**
 * @author: Paul
 * @time:2017/11/15 23:10
 * @description:
 */
public class CloseLightCommand implements ICommand {
    private Light light;
    public CloseLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.close(false);
    }

    @Override
    public void cancel() {
        System.out.println("["+light+"]接收到撤销命令，开始撤销下列动作");
        light.close(true);
    }
}
