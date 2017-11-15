package com.wq.design.model.command;

import com.wq.design.model.command.exec.ICommand;
import com.wq.design.model.command.exec.NoCommand;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author: Paul
 * @time:2017/11/15 22:24
 * @description:遥控器的实现类
 */
public class RemoteControl {
    private static final int CONTROL_BUTTONS = 10;
    ICommand[] onCommands = null;
    ICommand[] offCommands = null;

    Stack<ICommand> cancelStack = new Stack<>();

    public RemoteControl(){
        onCommands = new ICommand[CONTROL_BUTTONS];
        offCommands = new ICommand[CONTROL_BUTTONS];
        for(int i =0;i<CONTROL_BUTTONS;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index,ICommand onCommand,ICommand offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }
    public void pressOnButton(int index){
        onCommands[index].execute();
        cancelStack.push(onCommands[index]);
    }

    public void pressOffButton(int index){
        offCommands[index].execute();
        cancelStack.push(offCommands[index]);
    }

    public void cancel(){
        ICommand cancelCommand;
        try {
            cancelCommand = cancelStack.pop();
            cancelCommand.cancel();
        }catch (EmptyStackException e){
            System.out.println("已经撤销到最开始的命令了，没有命令可以再被撤销了");
        }
    }
}
