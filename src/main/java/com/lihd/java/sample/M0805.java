package com.lihd.java.sample;

/**
 * @program: lihd-leetcode
 * @description: 面试题 08.05. 递归乘法
 * @author: li_hd
 * @create: 2020-03-31 21:45
 **/
public class M0805 {

    public int multiply(int A, int B) {

        if (B == 0) {
            return 0;
        }
        if (B == 1) {
            return A;
        }
        return (A << 1) + multiply(A, B - 2);
    }

    private int helper(int a, int b) {

        if (b == 0)
            return 0;

        return a + multiply(a, b - 1);

    }


}
