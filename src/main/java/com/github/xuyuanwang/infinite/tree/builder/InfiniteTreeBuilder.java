package com.github.xuyuanwang.infinite.tree.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 无限级树形构建工具
 */
public final class InfiniteTreeBuilder {

    /**
     * 根节点 ID
     */
    private static final String ROOT_NODE_ID = "root";

    private InfiniteTreeBuilder() {
    }

    /**
     * 构建树形
     *
     * @param nodes
     * @return
     */
    public static List<Node> buildTree(List<? extends Node> nodes) {
        if (nodes == null || nodes.isEmpty()) {
            return null;
        }

        List<Node> rootNodes = new ArrayList<>();
        for (Node node : nodes) {
            if (ROOT_NODE_ID.equals(node.getParentId())) {
                rootNodes.add(node);
                buildChildren(node, nodes);
            }
        }
        // 对根节点进行排序
        Collections.sort(rootNodes);
        return rootNodes;
    }

    /**
     * 构建子节点（递归，深度优先）
     *
     * @param parentNode
     * @param nodes
     */
    private static void buildChildren(Node parentNode, List<? extends Node> nodes) {
        final String parentId = parentNode.getId();
        List<Node> children = new ArrayList<>();
        parentNode.setChildren(children);
        for (Node node : nodes) {
            if (node.getParentId().equals(parentId)) {
                children.add(node);
                buildChildren(node, nodes);
            }
        }
        // 对子节点进行排序
        Collections.sort(children);
    }

}