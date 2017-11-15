package com.wq.design.model.command.controls;

/**
 * @author: Paul
 * @time:2017/11/15 22:49
 * @description:
 */
public abstract class AbstractSubject {
    private boolean switchOn;

    protected void changeState(){
        synchronized (this){
            switchOn = !switchOn;
        }
    }

    protected boolean isSwitchOn(){
        return this.switchOn;
    }

    @Override
    public String toString() {
        return "AbstractSubject{" +
                "switchOn=" + switchOn +
                '}';
    }
}
