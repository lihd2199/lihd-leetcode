package com.lihd.java.dp;

import com.lihd.java.common.Type;
import com.lihd.java.common.TypeValue;

/**
 * @program: lihd-leetcode
 * @description: 爬楼梯 https://leetcode-cn.com/problems/climbing-stairs/
 * @author: li_hd
 * @create: 2020-04-03 15:08
 **/
public class L70 {

    @Type(TypeValue.dp)
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        return dp[n];

    }



}
