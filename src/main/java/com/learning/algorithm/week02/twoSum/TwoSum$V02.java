package com.learning.algorithm.week02.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum$V02 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2 ,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            } else {
                int remain = target - nums[i];
                map.put(remain, i);
            }
        }
        return new int[0];
    }

}
