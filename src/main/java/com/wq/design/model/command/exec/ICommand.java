package com.wq.design.model.command.exec;

/**
 * @author: Paul
 * @time:2017/11/15 21:24
 * @description:命令接口
 */
public interface ICommand {
    void execute();//对外暴露的方法，执行一个命令

    void cancel();//取消上一个命令操作
}
