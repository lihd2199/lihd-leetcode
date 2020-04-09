package com.lihd.java.offer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description: 数组中重复的数字
 * @author: li_hd
 * @create: 2020-04-08 11:39
 **/
public class M3 {

    public int findRepeatNumber(int[] nums) {

        final Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;

    }


}
