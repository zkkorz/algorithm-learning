package com.learning.algorithm.week04.findleftrepeatnum;

import java.util.*;

public class FindLeftRepeatNum$V01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find_left_repeat_num(new int[]{1,5,2,2,5,5})));
    }

    public static int[] find_left_repeat_num(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(record.containsKey(nums[i])){
                nums[i] = 0;
            } else {
                record.put(nums[i], nums[i]);
                nums[i] = -1;
            }
        }
        return nums;
    }

}
