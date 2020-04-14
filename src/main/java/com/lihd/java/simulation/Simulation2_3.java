package com.lihd.java.simulation;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 10:35
 **/
public class Simulation2_3 {

    public int kConcatenationMaxSum(int[] arr, int k) {


        if (arr == null || k == 0)
            return 0;

        boolean all = true;
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                all = false;
            }
            sum += i % 10000000;
        }
        if (all) {
            return 0;
        }
        if (sum > 0) {
            return k * sum;
        } else {

            //1 包括0的最大值
            //2 包括length-1的最大值
            //3 正常的的最大值

            int count1 = arr[arr.length - 1];
            int max = 0;
            if (arr[arr.length - 1] > 0) {
                int count = 0;
                for (int i : arr) {
                    count += i % 10000000;
                    max = Math.max(max, count);
                }
            }
            count1 += max;

            int count2 = arr[0];
            max = 0;
            if (arr[0] > 0) {
                int count = 0;
                for (int i = arr.length - 1; i >= 0; i--) {
                    count += arr[i] % 10000000;
                    max = Math.max(max, count);
                }
            }
            count2 += max;


            int[][] dp = new int[arr.length][arr.length];
            dp[1][1] = arr[1];
            int count3 = dp[1][1];
            for (int i = 1; i < arr.length - 1; i++) {
                for (int i1 = 2; i1 < arr.length - 1; i1++) {
                    dp[i][i1] = dp[i][i1 - 1] + arr[i1];
                    count3 = Math.max(Math.max(count3, dp[i][i1]), arr[i1]);
                }
            }

            return Math.max(Math.max(count1, count2), count3);

        }


    }


}
