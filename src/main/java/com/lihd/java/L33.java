package com.lihd.java;

/**
 * @program: lihd-leetcode
 * @description: (例如 ， 数组   [0, 1, 2, 4, 5, 6, 7]   可能变为   [3, 4, 5, 6, 7, 8, 0, 1, 2]  )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。 log n
 * @author: li_hd
 * @create: 2020-04-30 18:20
 **/
public class L33 {

    public int search(int[] nums, int target) {


        int l1 = 0, h1 = nums.length - 1, center;

        while (l1 <= h1) {
            center = (l1 + h1) / 2;
            if (nums[center] == target) {
                return center;
            }
            if (nums[l1] <= nums[center]) {
                if (target >= nums[l1] && target < nums[center]) {
                    h1 = center - 1;
                } else {
                    l1 = center + 1;
                }
            } else {
                if (target > nums[center] && target <= nums[h1]) {
                    l1 = center + 1;
                } else {
                    h1 = center - 1;
                }

            }
        }

        return -1;


    }

    public int search2(int[] nums, int target) {

        int lo = 0, hi = nums.length - 1, mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 先根据 nums[mid] 与 nums[lo] 的关系判断 mid 是在左段还是右段
            if (nums[mid] >= nums[lo]) {
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;


    }


}
