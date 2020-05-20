package com.lihd.java.offer;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-18 19:57
 **/
public class M21 {

    public boolean IsPopOrder(int[] pushA, int[] popA) {

        if (popA == null || pushA == null || popA.length != pushA.length)
            return false;

        Stack<Integer> stack = new Stack<>();

        int i = 0;
        for (int push : pushA) {
            if (push == popA[popA.length - 1 - i]) {
                stack.add(push);
                i++;
            }
        }
        System.out.println(stack);
        return false;
    }

}
