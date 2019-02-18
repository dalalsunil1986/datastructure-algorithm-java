package com.hellokoding.algorithm;

import com.hellokoding.datastructure.BSTByLinkedList;

public class BinaryTreeHeight extends BSTByLinkedList {
    public int height(Node node) {
        if (node == null) return -1;

        return Math.max(1 + height(node.left), 1 + height(node.right));
    }

    public static void main(String[] args) {
        BinaryTreeHeight tree = new BinaryTreeHeight();
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        tree.insert(2);
        tree.insert(3);

        tree.inTraversal(tree.root);
        System.out.println(tree.height(tree.root));
    }
}
