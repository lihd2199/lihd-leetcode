package com.lihd.java.simulation;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 10:23
 **/
public class Simulation2_2 {


    public int[] decompressRLElist(int[] nums) {


        if (nums == null || nums.length < 2 || nums.length % 2 == 1)
            return null;

        int arrayLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1)
                continue;
            arrayLength += nums[i];
        }

        int[] result = new int[arrayLength];

        int offset = 0;
        int freq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                freq = nums[i];
                continue;
            }

            for (int i1 = 0; i1 < freq; i1++) {
                result[offset] = nums[i];
                offset++;
            }
        }

        return result;

    }


}
