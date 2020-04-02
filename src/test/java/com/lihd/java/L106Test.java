package com.lihd.java;

import com.lihd.java.tree.L106;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-01 16:46
 **/
public class L106Test {

    @Test
    public void test(){

        System.out.println(System.currentTimeMillis());

        L106 l106 = new L106();

        final TreeNode treeNode = l106.buildTree(
                new int[]{9,3,15,20,7},
                new int[]{9,15,7,20,3});

        System.out.println(System.currentTimeMillis());

        System.out.println(treeNode);
    }


}
