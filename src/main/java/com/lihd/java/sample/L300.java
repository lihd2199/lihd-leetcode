package com.lihd.java.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description: 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * @author: li_hd
 * @create: 2020-04-30 16:34
 **/
public class L300 {


    public int lengthOfLIS(int[] nums) {


        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int max = 1;

        Integer[] dp = new Integer[nums.length];
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++) {   //10, 9, 2, 5, 3, 7, 101, 18
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
                max = Math.max(max, dp[i]);
            }
        }

        return max;

    }

}
