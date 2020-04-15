package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 组合总和 https://leetcode-cn.com/problems/combination-sum/
 * @author: li_hd
 * @create: 2020-04-15 11:46
 **/
public class L39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, res, 0, new ArrayList<>());

        return res;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tmp_list) {

        if (target < 0) return;

        if (target == 0) {
            res.add(new ArrayList<>(tmp_list));
            return;
        }

        for (int start = i; start < candidates.length; start++) {

            tmp_list.add(candidates[start]);

            backtrack(candidates, target - candidates[start], res, start, tmp_list);

            tmp_list.remove(tmp_list.size() - 1);
        }
    }


}
