package com.lihd.java;

import com.lihd.java.offer.M6;
import com.lihd.java.tree.ListNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 14:05
 **/
public class M6Test {


    @Test
    public void test(){

        M6 m6 = new M6();

        final ListNode listNode1= new ListNode(1);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode3;
        listNode3.next = listNode2;

        System.out.println(Arrays.toString(m6.reversePrint(listNode1)));


    }


}
