package com.wq.design.model.combine;

import java.util.Iterator;

/**
 * @author: Paul
 * @time:2017/11/27 21:15
 * @description:作为叶子节点和子节点的抽象表示
 */
public abstract class Node {
    //新增子节点
    protected  void addChild(Node node){
        throw new NodeException("抽象父类-->新增子节点异常");
    }

    protected  void removeChild(Node node){
        throw new NodeException("抽象父类-->移除子节点异常");
    }

    protected  void removeChild(int index){
        throw new NodeException("抽象父类-->新增子节点异常(按照下标)");
    }

    protected  Node obtainChild(int index){
        throw new NodeException("抽象父类-->获取子节点异常");
    }

    protected  Iterator<Node> createIterate(){
        throw new NodeException("抽象父类-->获取迭代器异常");
    }

    protected  void addAttribute(String attr){
        throw new NodeException("抽象父类-->新增节点属性异常");
    }

    protected  void addValue(String value){
        throw new NodeException("抽象父类-->新增节点值异常");
    }

    protected void addNodeName(String nodeName){
        throw new NodeException("抽象父类-->新增节点名称异常");
    }
    protected abstract void showSelf();

}
