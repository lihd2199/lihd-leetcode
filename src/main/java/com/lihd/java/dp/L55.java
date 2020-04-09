package com.lihd.java.dp;


import com.lihd.java.common.Type;
import com.lihd.java.common.TypeValue;

/**
 * @program: lihd-leetcode
 * @description: 跳跃游戏 https://leetcode-cn.com/problems/jump-game/
 * @author: li_hd
 * @create: 2020-04-03 13:52
 **/
public class L55 {


    private int[] nums;

    private Boolean[] dp;


    public boolean canJump(int[] nums) {

        return helper2(nums);

    }

    /**
     * 时间复杂度过高
     *
     * @param index 当前位置索引
     */
    @Type({TypeValue.recursive, TypeValue.backtracking})
    private boolean helper(int index) {

        int value = nums[index];

        if (index == nums.length - 1)
            return true;

        if (value == 0)
            return false;

        for (int i = 1; i <= value; i++) {

            if (helper(index + i)) {
                return true;
            }

        }

        return false;

    }


    //只有遇到了0 而且不是最后一个  这一走法 才算失败
    @Type(TypeValue.greedy)
    private boolean helper2(int[] nums) {

        int lastpot = nums.length - 1;
        for (int i = lastpot - 1; i > -1; i--) {
            if (nums[i] + i >= lastpot) {
                lastpot = i;
            }
        }
        return lastpot == 0;

    }


    //todo dp


}
