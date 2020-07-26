package com.learning.algorithm.week03.buildTreeByPreAndInOrder;

import java.util.HashMap;
import java.util.Map;

public class BuildTree$V01 {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }

    /**
     * 前序遍历第一个节点为根节点
     * 中序遍历第一个节点为深度最大的左节点
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
       return buildTree(preorder, inorder, 0, length - 1, 0, length - 1);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder, int preStart
        , int preEnd, int inStart, int inEnd) {
        if(preStart > preEnd){
            return null;
        }
        int inRootNodeIndex = map.get(preorder[preStart]);
        TreeNode root = new TreeNode(preorder[preStart]);
        int leftTreeLength = inRootNodeIndex - inStart;
        root.left = buildTree(preorder, inorder, preStart + 1
                , preStart + leftTreeLength, inStart, inRootNodeIndex - 1);
        root.right = buildTree(preorder, inorder, preStart + leftTreeLength + 1
                , preEnd, inRootNodeIndex + 1, inEnd);
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}