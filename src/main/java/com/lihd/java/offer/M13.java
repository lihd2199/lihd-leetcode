package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 机器人的运动范围  https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 * @author: li_hd
 * @create: 2020-04-08 11:01
 **/
public class M13 {


    public int movingCount(int m, int n, int k) {

        int count = 0;

        Boolean[][] dp = new Boolean[m][n];

        dp[0][0] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
                int sum = i / 10 + i % 10 + j / 10 + j % 10;
                if (sum <= k && dp[i][j]) {
                    count++;
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return count;

    }


}
