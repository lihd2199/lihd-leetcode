package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 青蛙跳台阶问题 https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * @author: li_hd
 * @create: 2020-04-08 17:55
 **/
public class M10II {


    public int numWays(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] dp = new int[n + 1];

        for (int i = 3; i <= n; i++) {

            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;

        }

        return dp[n];

    }


}
