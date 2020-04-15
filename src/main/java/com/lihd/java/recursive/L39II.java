package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description: 组合总和 II https://leetcode-cn.com/problems/combination-sum-ii/
 * @author: li_hd
 * @create: 2020-04-15 13:57
 **/
public class L39II {

    private Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        if (candidates == null || candidates.length == 0)
            return null;

        if (target == 0)
            return new ArrayList<>();

        Arrays.sort(candidates);

        helper(candidates, target, new ArrayList<>(), 0, 0);

        return new ArrayList<>(result);
    }

    private void helper(int[] candidates, int target, ArrayList<Integer> integers, int count, int index) {

        if (count > target)
            return;

        if (count == target) {
            result.add(new ArrayList<>(integers));
        }

        for (int i = index; i < candidates.length; i++) {

            final int candidate = candidates[i];

            integers.add(candidate);

            helper(candidates, target, integers, count + candidate, i + 1);

            integers.remove(integers.size() - 1);

        }


    }


}
