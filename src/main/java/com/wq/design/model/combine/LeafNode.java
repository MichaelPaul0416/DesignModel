package com.wq.design.model.combine;

import java.util.Iterator;

/**
 * @author: Paul
 * @time:2017/11/27 22:58
 * @description:
 */
public class LeafNode extends Node {

    private String nodeName;

    private String value;

    public LeafNode(String nodeName, String value) {
        this.nodeName = nodeName;
        this.value = value;
    }

    public LeafNode() {
    }

    @Override
    public String toString() {
        return "LeafNode{" +
                "nodeName='" + nodeName + '\'' +
                ", value='" + value + '\'' +
                "} " + super.toString();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    protected void addNodeName(String nodeName){
        this.nodeName = "<LeafNodeName>" + nodeName;
    }

    @Override
    protected void addValue(String value){
        this.value = "<LeafNodeValue>" + value;
    }

    @Override
    protected void showSelf() {
        System.out.println("<LeafNodePrint>--" + this.toString());
    }

    @Override
    protected Iterator<Node> createIterate(){
        return new Iterator<Node>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Node next() {
                return null;
            }
        };
    }
}
