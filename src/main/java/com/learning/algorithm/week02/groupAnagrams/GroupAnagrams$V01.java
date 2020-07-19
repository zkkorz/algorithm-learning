package com.learning.algorithm.week02.groupAnagrams;

import java.util.*;

public class GroupAnagrams$V01 {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        if(strings == null || strings.length == 0){
            return new ArrayList<>();
        } else {
            Map<String, List<String>> map = new HashMap<>();
            for(String string : strings){
                char[] chars = string.toCharArray();
                Arrays.sort(chars);
                String temp = String.valueOf(chars);
                if(map.containsKey(temp)){
                    map.get(temp).add(string);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(string);
                    map.put(temp, list);
                }
            }
            return new ArrayList<>(map.values());
        }
    }

}
