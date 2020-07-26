//package com.learning.algorithm.week03.permute;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class Permute$V01 {
//
//    private static List<List<Integer>> result = new ArrayList<>();
//
//    public static void main(String[] args) {
//        System.out.println(permute(new int[]{1,2,3}));
//        //System.out.println(combine(1, 1));
//    }
//
//    public static List<List<Integer>> permute(int[] nums) {
//        backtrack(nums,0, 0, new Stack<>());
//        return result;
//    }
//
//    private static void backtrack(int[] nums, int start, int flag, Stack<Integer> res) {
//        int length = nums.length;
//        if(start == length){
//            result.add(new ArrayList<>(res));
//        }
//        for(int i = 0; i < length; i++){
//            if(flag != start && flag == i){
//                continue;
//            }
//            res.add(nums[i]);
//            backtrack(nums, i + 1, i, res);
//            res.pop();
//        }
//    }
//}
