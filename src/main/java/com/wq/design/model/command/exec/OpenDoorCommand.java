package com.wq.design.model.command.exec;

import com.wq.design.model.command.controls.Door;

/**
 * @author: Paul
 * @time:2017/11/15 21:42
 * @description:打开门的封装命令
 */
public class OpenDoorCommand implements ICommand {
    private Door door;
    public OpenDoorCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open(false);
    }

    @Override
    public void cancel() {
        System.out.println("["+this.door+"]接收到撤销命令，开始撤销下列动作");
        door.open(true);
    }
}
