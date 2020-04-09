package com.lihd.java.offer;

import com.lihd.java.tree.ListNode;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 从尾到头打印链表  https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @author: li_hd
 * @create: 2020-04-08 14:01
 **/
public class M6 {


    public int[] reversePrint(ListNode head) {

        final Stack<Integer> integers = new Stack<>();

        while (head != null) {
            integers.push(head.val);
            head = head.next;
        }

        final int[] ints = new int[integers.size()];


        int size = 0;
        while (!integers.empty()) {
            ints[size++] = integers.pop();
        }

        return ints;

    }


}
