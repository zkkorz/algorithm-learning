package com.learning.algorithm.week01.deleteArrayRepeatedElement;

public class DeleteArrayRepeatedElement$V02 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    /**
     * 重点： 排序好的数组
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
