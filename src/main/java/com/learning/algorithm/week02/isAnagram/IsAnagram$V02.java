package com.learning.algorithm.week02.isAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsAnagram$V02 {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if(Objects.isNull(s) || Objects.isNull(t)){
            return false;
        } else if(s.length() != t.length()){
            return false;
        } else {
            int[] counter = new int[26];
            for(int i = 0; i < s.length(); i++){
                counter[s.charAt(i) - 'a']++;
                counter[t.charAt(i) - 'a']--;
            }
            for(int count : counter){
                if(count != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
