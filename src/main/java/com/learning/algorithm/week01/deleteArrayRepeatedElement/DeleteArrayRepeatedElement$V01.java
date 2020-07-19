package com.learning.algorithm.week01.deleteArrayRepeatedElement;

import java.util.Objects;

public class DeleteArrayRepeatedElement$V01 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    /**
     * 重点： 排序好的数组
     */
    public static int removeDuplicates(int[] nums) {
        if(Objects.isNull(nums)){
            return 0;
        }
        if(nums.length < 2){
            return nums.length;
        }
        int index = 0;
        int compareNum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if (compareNum != nums[i]) {
                index++;
                compareNum = nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
