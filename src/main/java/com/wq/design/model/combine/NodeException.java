package com.wq.design.model.combine;

/**
 * @author: Paul
 * @time:2017/11/27 22:55
 * @description:
 */
public class NodeException extends RuntimeException {
    public NodeException(String msg){
        super(msg);
    }

    public NodeException(String msg,Throwable e){
        super(msg,e);
    }
}
