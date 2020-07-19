package com.learning.algorithm.week02.twoSum;

import java.util.Arrays;

public class TwoSum$V01 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2 ,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int left = 0; left < nums.length; left++) {
            for(int right = nums.length - 1; right >= 0 && right > left; right--) {
                if(nums[left] + nums[right] == target){
                    return new int[]{left, right};
                }
            }
        }
        return new int[0];
    }

}
