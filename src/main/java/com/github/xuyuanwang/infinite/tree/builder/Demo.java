package com.github.xuyuanwang.infinite.tree.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用演示
 */
public class Demo {

    private static final List<Node> NODES;

    static {
        Node node1 = new Node();
        node1.setId("1");
        node1.setName("节点 1");
        node1.setLevel(1);
        node1.setIndexNumber(0);
        node1.setParentId("root");

        Node node2 = new Node();
        node2.setId("2");
        node2.setName("节点 2");
        node2.setLevel(1);
        node2.setIndexNumber(1);
        node2.setParentId("root");

        Node node2_1 = new Node();
        node2_1.setId("2-1");
        node2_1.setName("节点 2-1");
        node2_1.setLevel(2);
        node2_1.setIndexNumber(0);
        node2_1.setParentId("2");

        Node node2_2 = new Node();
        node2_2.setId("2-2");
        node2_2.setName("节点 2-2");
        node2_2.setLevel(2);
        node2_2.setIndexNumber(1);
        node2_2.setParentId("2");

        Node node2_1_1 = new Node();
        node2_1_1.setId("2-1-1");
        node2_1_1.setName("节点 2-1-1");
        node2_1_1.setLevel(3);
        node2_1_1.setIndexNumber(0);
        node2_1_1.setParentId("2-1");

        NODES = new ArrayList<>(5);
        NODES.add(node1);
        NODES.add(node2);
        NODES.add(node2_1);
        NODES.add(node2_2);
        NODES.add(node2_1_1);
    }

    public static void main(String[] args) {
        List<Node> tree = InfiniteTreeBuilder.buildTree(NODES);
        System.out.println(tree);
    }

}