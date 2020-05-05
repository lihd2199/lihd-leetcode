package com.lihd.java.simulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 15:27
 **/
public class Simulation3_1 {


    public int lenLongestFibSubseq(int[] A) {

        if (A == null || A.length < 3)
            return 0;

        Set<Integer> S = new HashSet<>();
        for (int x : A) S.add(x);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int x = A[j], y = A[i] + A[j];
                int length = 2;
                while (S.contains(y)) {
                    // x, y -> y, x+y
                    int tmp = y;
                    y += x;
                    x = tmp;
                    max = Math.max(max, ++length);
                }
            }
        }


        return max;

    }


    private int max = 0;


    //首先得保证 最少有三个   找出所有的三个   在三个基础上  再找
    private void helper(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int contain = isContain(nums, nums[i] + nums[j], j);
                if (contain != -1) {
                    max = Math.max(3, max);
                    helper2(nums, new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[contain])), contain);
                }
            }
        }

    }

    private void helper2(int[] nums, List<Integer> list, int index) {

        for (int i = index + 1; i < nums.length; i++) {
            final int contain = isContain(nums, list.get(list.size() - 1) + list.get(list.size() - 2), i);
            if (contain != -1) {
                list.add(nums[contain]);
                helper2(nums, list, contain);
                max = Math.max(max, list.size());
                list.remove(list.size() - 1);
            }
        }


    }


    private int isContain(int[] nums, int number) {

        if (number < nums[0] || number > nums[nums.length - 1])
            return -1;

        for (int i1 = 0; i1 < nums.length; i1++) {

            int num = nums[i1];
            if (number == num)
                return i1;
            if (number < num)
                return -1;
        }

        return -1;

    }

    private int isContain(int[] nums, int number, int index) {

        if (number < nums[0] || number > nums[nums.length - 1])
            return -1;

        for (int i1 = index; i1 < nums.length; i1++) {

            int num = nums[i1];
            if (number == num)
                return i1;
            if (number < num)
                return -1;
        }

        return -1;

    }


}
