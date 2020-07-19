package com.learning.algorithm.week01.plusOne;

import java.util.Arrays;

public class PlusOne$V01 {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,9})));
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {
        boolean hasRefresh = false;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
                if(i == 0){
                    hasRefresh = true;
                }
            }
        }
        if(hasRefresh){
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            System.arraycopy(digits, 0, newArray, 1, newArray.length - 1);
            return newArray;
        }
        return digits;
    }

}
