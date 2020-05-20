package com.lihd.java;

import com.lihd.java.sample.L19;
import com.lihd.java.tree.ListNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 17:04
 **/
public class L19Test {

    @Test
    public void test(){

        L19 l19 = new L19();

        final ListNode listNode1 = new ListNode(1);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(3);
        final ListNode listNode4 = new ListNode(4);
        final ListNode listNode5 = new ListNode(5);
        final ListNode listNode6 = new ListNode(6);
        final ListNode listNode7 = new ListNode(7);
        final ListNode listNode8 = new ListNode(8);


        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode8;


        final ListNode listNode = l19.removeNthFromEnd(listNode1, 1);

        System.out.println(listNode);


    }

}
