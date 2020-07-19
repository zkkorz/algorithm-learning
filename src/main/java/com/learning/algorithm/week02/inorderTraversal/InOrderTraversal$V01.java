package com.learning.algorithm.week02.inorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal$V01 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        System.out.println(inorderTraversal(treeNode1));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalSelf(result, root);
        return result;
    }

    public static void inorderTraversalSelf(List<Integer> result, TreeNode node) {
        if(node == null){
            return;
        }
        if(node.left != null){
            inorderTraversalSelf(result, node.left);
        }
        result.add(node.val);
        if(node.right != null){
            inorderTraversalSelf(result, node.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}