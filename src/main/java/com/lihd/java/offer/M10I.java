package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 斐波那契数列 https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * @author: li_hd
 * @create: 2020-04-08 17:30
 **/
public class M10I {

    public int fib(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;

        }

        System.out.println(dp[n]);

        return dp[n];

    }


}
