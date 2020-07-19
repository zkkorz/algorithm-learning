package com.learning.algorithm.week02.isAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsAnagram$V01 {

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
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            for(int i = 0; i < t.length(); i++){
                char c = t.charAt(i);
                if(map.containsKey(c)){
                    Integer count = map.get(c);
                    if(--count == 0){
                        map.remove(c);
                    } else {
                        map.put(c, count);
                    }
                } else {
                    return false;
                }
            }
            return map.size() <= 0;
        }
    }
}
