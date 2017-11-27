package com.wq.design.model.combine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Paul
 * @time:2017/11/27 23:26
 * @description:
 */
public class CombineDemo {
    public static void main(String args[]){
        /*<plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>*/
        Node source = new LeafNode("source","1.8");
        Node target = new LeafNode("target","1.8");
        List<Node> list = new ArrayList<>();
        list.add(source);
        list.add(target);

        Node configuration = new CompositeNode(list,"Configuration");
        Node groupId = new LeafNode("groupId","org.apache.maven.plugins");
        Node artifactId = new LeafNode("artifactId","maven-compiler-plugin");

        List<Node> rootList = new ArrayList<>();
        rootList.add(groupId);
        rootList.add(artifactId);
        rootList.add(configuration);
        Node root = new CompositeNode(rootList,"plugin");

        root.showSelf();
    }
}
