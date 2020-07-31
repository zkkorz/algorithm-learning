package com.learning.algorithm.week04.findMagicIndex;

public class FindMagicIndex$V01 {

    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{0, 2, 3, 4, 5}));
        System.out.println(findMagicIndex(new int[]{1, 1, 1}));
        System.out.println(findMagicIndex(new int[]{1, 2, 2, 3, 4}));
    }

    public static int findMagicIndex(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i){
                return i;
            }
        }
        return -1;
    }

}
