package com.lihd.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 14:40
 **/
public class L1 {


    public int[] twoSum(int[] nums, int target) {

        if (nums == null)
            return null;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.get(nums[i]) == null)
                map.put(target - nums[i], i);
            else
                return new int[]{map.get(nums[i]), i};

        }

        return null;

    }

}
