package com.learning.algorithm.week03.combine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * result = []
 * def backtrack(路径, 选择列表):
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *     for 选择 in 选择列表:
 *         做选择
 *         backtrack(路径, 选择列表)
 *         撤销选择
 *
 * 作者：labuladong
 * 链接：https://leetcode-cn.com/problems/combinations/solution/hui-su-si-xiang-tuan-mie-pai-lie-zu-he-zi-ji-wen-2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Combine$V01 {

    private static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
        //System.out.println(combine(1, 1));
    }

    public static List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1, new Stack<>());
        return result;
    }

    private static void backtrack(int n, int k, int start, Stack<Integer> res) {
        if(res.size() > k){
            return;
        }
        if(res.size() == k){
            result.add(new ArrayList<>(res));
        }
        for(int i = start; i <= n; ++i){
            res.add(i);
            backtrack(n, k,i + 1, res);
            res.pop();
        }
    }

}
