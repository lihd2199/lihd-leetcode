package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 二进制中1的个数  https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * @author: li_hd
 * @create: 2020-04-09 13:06
 **/
public class M15 {

    public int hammingWeight(int n) {

        int sum = 0;

        while (n != 0) {
            sum++;
            n=n&(n-1);
        }

        return sum;

    }


}
