package com.learning.algorithm.week02.levelOrder;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder$V01 {

    public static void main(String[] args) {
        Node2 node1 = new Node2(1);
        Node2 node2 = new Node2(2);
        Node2 node3 = new Node2(3);
        Node2 node4 = new Node2(4);
        Node2 node5 = new Node2(5);
        Node2 node6 = new Node2(6);
        List<Node2> node3Children = new ArrayList<>();
        node3Children.add(node5);
        node3Children.add(node6);
        node3.children = node3Children;
        List<Node2> node1Children = new ArrayList<>();
        node1Children.add(node3);
        node1Children.add(node2);
        node1Children.add(node4);
        node1.children = node1Children;
        System.out.println(levelOrder(node1));
    }

    public static List<List<Integer>> levelOrder(Node2 root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root != null){
            List<Node2> nextNodes = new ArrayList<>();
            nextNodes.add(root);
            levelOrderSelf(result, nextNodes);
        }
        return result;
    }

    public static void levelOrderSelf(List<List<Integer>> result, List<Node2> nodes){
        List<Integer> temp = new ArrayList<>();
        List<Node2> nextNodes = new ArrayList<>();
        for(Node2 node : nodes){
            if(node == null){
                continue;
            }
            temp.add(node.val);
            if(node.children != null && node.children.size() > 0){
                nextNodes.addAll(node.children);
            }
        }
        result.add(temp);
        if(nextNodes.size() > 0){
            levelOrderSelf(result, nextNodes);
        }
    }
    

}

class Node2 {
    public int val;
    public List<Node2> children;

    public Node2() {}

    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, List<Node2> _children) {
        val = _val;
        children = _children;
    }
}