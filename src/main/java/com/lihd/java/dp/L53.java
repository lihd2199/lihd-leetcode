package com.lihd.java.dp;

import com.lihd.java.common.Type;
import com.lihd.java.common.TypeValue;

/**
 * @program: lihd-leetcode
 * @description: 最大子序和  https://leetcode-cn.com/problems/maximum-subarray/
 * @author: li_hd
 * @create: 2020-04-03 16:35
 **/
public class L53 {


    /**
     * 超出了内存限制
     * <p>
     * 时间复杂度和空间复杂度 都过高
     */
    @Deprecated
    @Type(TypeValue.dp)
    public int maxSubArray(int[] nums) {

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int[][] dp = new int[nums.length][nums.length];

        int max = nums[0];

        dp[0][0] = max;


        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != i) {
                    dp[j][i] = dp[j][i - 1] + nums[i];
                } else {
                    dp[i][i] = nums[i];
                }
                max = Math.max(max, dp[j][i]);
            }
        }

        return max;

    }



    //todo
    public int maxSubArrayV2(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int currSum = nums[0];
        int mathSum = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            currSum = Math.max(currSum, currSum + nums[i]);
            mathSum = Math.max(mathSum, currSum);
        }

        return mathSum;


    }

}
