package com.learning.algorithm.week02.levelOrder;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder$V01 {

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
        System.out.println(levelOrder(node1));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root != null){
            List<Node> nextNodes = new ArrayList<>();
            nextNodes.add(root);
            levelOrderSelf(result, nextNodes);
        }
        return result;
    }

    public static void levelOrderSelf(List<List<Integer>> result, List<Node> nodes){
        List<Integer> temp = new ArrayList<>();
        List<Node> nextNodes = new ArrayList<>();
        for(Node node : nodes){
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