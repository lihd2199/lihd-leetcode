package com.lihd.java.offer;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 用两个栈实现队列 https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * @author: li_hd
 * @create: 2020-04-08 16:00
 **/
public class M9 {

    public M9() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void appendTail(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    public int deleteHead() {
        if (size == 0) return -1;
        size--;
        return stack1.pop();
    }

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int size;

}
