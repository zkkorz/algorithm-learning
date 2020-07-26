package com.learning.algorithm.week03.lowestCommonAncestor;

import java.util.Arrays;

public class LowestCommonAncestor$V01 {

    private static TreeNode ans;

    public static void main(String[] args) {
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode1;
        treeNode1.left = treeNode0;
        treeNode1.right =treeNode8;
        treeNode5.left = treeNode6;
        treeNode5.right = treeNode2;
        treeNode2.left = treeNode7;
        treeNode2.right = treeNode4;
        System.out.println(lowestCommonAncestor(treeNode3, treeNode5, treeNode1).val);
        System.out.println(lowestCommonAncestor(treeNode3, treeNode5, treeNode4).val);
        System.out.println(lowestCommonAncestor(treeNode3, treeNode6, treeNode2).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    public static boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return false;
        }
        boolean l = dfs(root.left, p, q);
        boolean r = dfs(root.right, p, q);
        if((l && r) || ((root == p || root == q) && (l || r))){
            ans = root;
        }
        return l || r || root == q || root == p;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}