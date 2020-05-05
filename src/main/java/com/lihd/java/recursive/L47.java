package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description: 全排列 II  https://leetcode-cn.com/problems/permutations-ii/
 * @author: li_hd
 * @create: 2020-04-15 15:05
 **/
public class L47 {


    public List<List<Integer>> permuteUnique(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Set<List<Integer>> result = new HashSet<>();

        helper(nums, result, new ArrayList<>(), new ArrayList<>());

        return new ArrayList<>(result);
    }

    private void helper(int[] nums, Set<List<Integer>> result, List<Integer> integers, List<Integer> indexs) {

        if (integers.size() == nums.length) {
            result.add(new ArrayList<>(integers));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (indexs.contains(i))
                continue;

            integers.add(nums[i]);
            indexs.add(i);

            helper(nums, result, integers, indexs);

            integers.remove(integers.size() - 1);
            indexs.remove(indexs.size() - 1);

        }


    }


}
