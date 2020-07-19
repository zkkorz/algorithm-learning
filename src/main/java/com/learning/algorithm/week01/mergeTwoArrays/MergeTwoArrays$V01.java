package com.learning.algorithm.week01.mergeTwoArrays;

import java.util.Arrays;
import java.util.Objects;

public class MergeTwoArrays$V01 {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int maxLength = n + m - 1;
        int index1 = m - 1 ;
        int index2 = n - 1;
        while (index2 >= 0 && index1 >= 0) {
            if(nums1[index1] < nums2[index2]){
                nums1[maxLength--] = nums2[index2--];
            } else {
                nums1[maxLength--] = nums1[index1--];
            }
        }
        while (index2 >= 0){
            nums1[index2] = nums2[index2--];
        }
        System.out.println(Arrays.toString(nums1));
    }

}
