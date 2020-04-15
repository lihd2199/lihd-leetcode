package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 全排列  https://leetcode-cn.com/problems/permutations/
 * @author: li_hd
 * @create: 2020-04-15 14:54
 **/
public class L46 {


    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        if (nums == null || nums.length == 0)
            return lists;

        helper(nums, new ArrayList<>());

        return lists;

    }

    private void helper(int[] nums, List<Integer> integerList) {

        if (integerList.size() == nums.length) {
            lists.add(new ArrayList<>(integerList));
            return;
        }

        for (final int num : nums) {
            if (integerList.contains(num))
                continue;
            integerList.add(num);
            helper(nums, integerList);
            integerList.remove(integerList.size() - 1);
        }
    }


}
