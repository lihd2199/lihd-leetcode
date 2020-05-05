package com.lihd.java.simulation;

/**
 * @program: lihd-leetcode
 * @description: 给定一个未经排序的整数数组，找到最长且连续的的递增序列。
 * @author: li_hd
 * @create: 2020-04-16 19:08
 **/
public class Simulation4_1 {

    public int findLengthOfLCIS(int[] nums) {

        if (nums == null)
            return -1;
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        int max = 1;

        int count = 1;

        int pre = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (pre < nums[i]) {
                pre = nums[i];
                count = count + 1;
                max = Math.max(count, max);
            } else {
                pre = nums[i];
                count = 1;
            }

        }

        return max;

    }


}
