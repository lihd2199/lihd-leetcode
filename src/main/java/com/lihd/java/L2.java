package com.lihd.java;

import com.lihd.java.tree.ListNode;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 14:47
 **/
public class L2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        int newVal = l1.val + l2.val;
        boolean next = newVal / 10 == 1;
        final ListNode listNode = new ListNode(newVal);

        helper(l1.next, l2.next, listNode, next);

        return listNode;
    }

    private void helper(ListNode l1, ListNode l2, ListNode listNode, boolean next) {

        int newVal = next ? 1 : 0;

        if (l1 == null && l2 == null)
            return;

        if (l1 != null) {
            newVal += l1.val;
        }
        if (l2 != null) {
            newVal += l2.val;
        }

        next = newVal / 10 == 1;
        ListNode child = new ListNode(newVal % 10);
        listNode.next = child;

        helper(l1 == null ? null : l1.next, l2 == null ? null : l2.next, child, next);


    }


}
