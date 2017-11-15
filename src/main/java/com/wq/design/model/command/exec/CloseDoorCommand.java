package com.wq.design.model.command.exec;

import com.wq.design.model.command.controls.Door;

/**
 * @author: Paul
 * @time:2017/11/15 22:34
 * @description:
 */
public class CloseDoorCommand implements ICommand{
    private Door door;
    public CloseDoorCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close(false);
    }

    @Override
    public void cancel() {
        System.out.println("["+door+"]收到撤销命令，开始撤销下列动作");
        door.close(true);
    }
}
