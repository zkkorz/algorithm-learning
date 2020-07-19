package com.learning.algorithm.week02.treepreorder;

import java.util.ArrayList;
import java.util.List;

public class PreOrder$V01 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> node3Children = new ArrayList<>();
        node3Children.add(node5);
        node3Children.add(node6);
        node3.children = node3Children;
        List<Node> node1Children = new ArrayList<>();
        node1Children.add(node3);
        node1Children.add(node2);
        node1Children.add(node4);
        node1.children = node1Children;
        System.out.println(preorder(node1));
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preOrderSelf(result, root);
        return result;
    }

    public static void preOrderSelf(List<Integer> result, Node node) {
        if(node == null){
            return;
        }
        result.add(node.val);
        if (node.children != null && node.children.size() > 0){
            for(Node child : node.children){
                preOrderSelf(result, child);
            }
        }
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
