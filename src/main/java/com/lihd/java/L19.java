package com.lihd.java;

import com.lihd.java.tree.ListNode;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 16:59
 **/
public class L19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head;
        }


        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.add(node);
            node = node.next;
        }


        ListNode pre = null;
        final int size = stack.size();
        for (int i = 1; i < size + 1; i++) {
            if (i == n) {
                stack.pop();
                continue;
            }
            final ListNode pop = stack.pop();
            if (pre == null) {
                pre = pop;
                pre.next = null;
            } else {
                pop.next = pre;
                pre = pop;
            }
        }

        return pre;
    }


}
