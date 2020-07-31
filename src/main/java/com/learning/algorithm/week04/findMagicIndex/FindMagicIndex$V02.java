package com.learning.algorithm.week04.findMagicIndex;

public class FindMagicIndex$V02 {

    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[]{0, 2, 3, 4, 5}));
        System.out.println(findMagicIndex(new int[]{1, 1, 1}));
        System.out.println(findMagicIndex(new int[]{1, 2, 2, 3, 4}));
    }

    public static int findMagicIndex(int[] nums) {
        return findMagicIndex(nums, 0, nums.length-1);
    }

    private static int findMagicIndex(int[] nums, int left, int right) {
        if(left > right){
            return -1;
        }
        int mid = (right - left) / 2 + left;
        int result = findMagicIndex(nums, left, mid - 1);
        if(result != -1){
            return result;
        } else if (nums[mid] == mid){
            return mid;
        }
        return findMagicIndex(nums, mid + 1, right);
    }

}
