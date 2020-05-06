package com.lihd.java;

/**
 * @program: lihd-leetcode
 * @description: //1 --> 0
 * //7 --> 1
 * //30 --> 2
 * @author: li_hd
 * @create: 2020-05-06 17:33
 **/
public class L983 {


    public int mincostTickets(int[] days, int[] costs) {


        if (days == null || costs == null)
            return -1;

        Integer[] dp = new Integer[days.length];

        dp[0] = Math.min(Math.min(costs[0], costs[1]), costs[2]);

        //如果没有  就找到有的最近一个

        for (int i = 1; i < days.length; i++) {

            //1天 昨天加今天
            int i0 = dp[i - 1] + costs[0];

            //7天  7天之前的第一个+这7天
            int i1 = costs[1];
            if (days[i] >= 7) {
                for (int j = i - 1; j >= 0; j--) {
                    if (days[i] - 7 >= days[j]) {
                        i1 = dp[j] + costs[1];
                        break;
                    }
                }
            }


            //30天  30天之前的第一个+这30天
            int i2 = costs[2];
            if (days[i] >= 30) {
                for (int j = i - 1; j >= 0; j--) {
                    if (days[i] - 30 >= days[j]) {
                        i2 = dp[j] + costs[2];
                        break;
                    }
                }
            }


            dp[i] = Math.min(Math.min(i0, i1), i2);

        }

        return dp[days.length - 1];


    }


}
