package com.deo.javalearning.algoritms.prefixTree;

import java.util.ArrayList;
import java.util.List;

public class PrefixTreeDemo {
    public static void main(String[] args) {

    }
static class TreeNode{
        char value;
        List<TreeNode> children;

        public TreeNode(char value){
        this.value = value;
        }

    public void insert(String data) {
            if(data.length()== 0){
                return;
            }
        if (children == null) {
            children = new ArrayList<>();
        }
        char c = data.charAt(0);
        TreeNode child = findNodeByChar(c);

        if (child == null) {
            child = new TreeNode(c);
            children.add(child);
        }
        child.insert(data.substring(1));

    }

    private TreeNode findNodeByChar(char c) {
        if (children != null) {
            for (TreeNode node : children) {
                if (node.value == c) {
                    return node;
                }
            }
        }
        return null;
    }

}

}
