package com.wq.design.model.combine;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author: Paul
 * @time:2017/11/27 23:05
 * @description:
 */
public class CompositeNode extends Node {

    private List<Node> childList;

    private String nodeName;

    public CompositeNode(List<Node> childList, String nodeName) {
        this.childList = childList;
        this.nodeName = nodeName;
    }

    public List<Node> getChildList() {
        return childList;
    }

    public void setChildList(List<Node> childList) {
        this.childList = childList;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    protected void addChild(Node child){
        System.out.println(String.format("[NodeName]%s新增节点",nodeName));
        childList.add(child);
    }

    @Override
    protected void removeChild(Node child){
        System.out.println(String.format("[NodeName]%s移除节点",nodeName));
        childList.remove(child);
    }

    @Override
    protected void removeChild(int index){
        System.out.println(String.format("[NodeName]%s移除下标为[%s]的节点",nodeName,index));
        childList.remove(index);
    }

    @Override
    protected Node obtainChild(int index){
        System.out.println(String.format("[NodeName]%s获取下标为[%s]的节点",nodeName,index));
        return childList.get(index);
    }


    @Override
    protected Iterator<Node> createIterate(){
        return new NodeIterator(childList.iterator());
    }


    @Override
    protected void showSelf() {
        System.out.println(String.format("[NodeName]%s",nodeName));
        System.out.println("====================================");
        Iterator<Node> iterator = childList.iterator();
        while (iterator.hasNext()){
            Node node = iterator.next();
            node.showSelf();
        }

    }

     private class NodeIterator implements Iterator<Node>{

        Stack<Iterator<Node>> stack ;

        public NodeIterator(Iterator<Node> iterator){
            stack = new Stack<>();
            stack.push(iterator);
        }

        @Override
        public boolean hasNext() {
           if(stack.isEmpty()){
               return false;
           }else{
               Iterator<Node> peek = stack.peek();
               //检查栈顶元素是否还可以迭代
               if(peek.hasNext()){
                   return true;
               }else {
                   //当前栈顶迭代器已经迭代好了，需要进行下一个迭代器的迭代
                   stack.pop();
                   return hasNext();
               }
           }
        }

        @Override
        public Node next() {
            if(hasNext()){
                Iterator<Node> iterator = stack.peek();
                Node node = iterator.next();//检查下一个是节点还是叶子节点
                if(node instanceof CompositeNode){
                    stack.push(node.createIterate());//如果是节点的话，将该节点的迭代器入栈
                }
                return node;
            }else {
                return null;
            }
        }
    }
}
