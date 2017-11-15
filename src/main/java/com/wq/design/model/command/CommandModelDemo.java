package com.wq.design.model.command;

import com.wq.design.model.command.controls.Door;
import com.wq.design.model.command.controls.Light;
import com.wq.design.model.command.exec.*;

/**
 * @author: Paul
 * @time:2017/11/15 22:32
 * @description:Client，相当于客户，使用遥控器的人
 */
public class CommandModelDemo {
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();
        Door door = new Door("遥控卷闸门");
        ICommand onCommand = new OpenDoorCommand(door);
        ICommand offCommand = new CloseDoorCommand(door);

        Light light = new Light("主卧吊灯");
        ICommand lightOn = new OpenLightCommand(light);
        ICommand lightOff = new CloseLightCommand(light);

        remoteControl.setCommand(0,onCommand,offCommand);
        remoteControl.setCommand(1,lightOn,lightOff);

        System.out.println("开始测试遥控器");
        remoteControl.pressOffButton(0);
        remoteControl.pressOnButton(0);
        remoteControl.cancel();
        remoteControl.cancel();
        remoteControl.cancel();
        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOnButton(0);
        remoteControl.cancel();
        remoteControl.pressOffButton(1);
    }
}
