package com.learning.algorithm.week01.rotateArray;

import java.util.Arrays;

public class RotateArray$V01 {

    public static void main(String[] args) {
        //rotate(new int[]{1,2,3,4,5,6,7}, 3);
        //rotate(new int[]{-1}, 2);
        rotate(new int[]{1,2,3,4,5,6}, 11);
        //rotate(new int[]{1,2}, 3);
        //rotate(new int[]{-1,-100,3,99}, 2);
    }

    /**
     * 思路： 存储最后一个元素移动后所在为位置和值
     */
    public static void rotate(int[] nums, int k) {
        if (k < 1) return;
        int count = 0;
        for(int start = 0; count < nums.length; start++){
            int temp = nums[start];
            int record;
            int target;
            int current = start;
            do {
                target = (current + k >= nums.length) ? k - (nums.length - current) : current + k;
                if(target >= nums.length){
                    target = target % nums.length;
                }
                record = nums[target];
                nums[target] = temp;
                temp = record;
                current = target;
                count++;
            } while (current != start);
        }
        System.out.println(Arrays.toString(nums));
    }
}
