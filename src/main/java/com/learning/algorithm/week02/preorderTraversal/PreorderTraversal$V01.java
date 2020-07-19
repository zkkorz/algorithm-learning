package com.learning.algorithm.week02.preorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal$V01 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        System.out.println(preorderTraversal(treeNode1));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalSelf(result, root);
        return result;
    }

    public static void preorderTraversalSelf(List<Integer> result, TreeNode node) {
        if(node == null){
            return;
        }
        result.add(node.val);
        if(node.left != null){
            preorderTraversalSelf(result, node.left);
        }
        if(node.right != null){
            preorderTraversalSelf(result, node.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}