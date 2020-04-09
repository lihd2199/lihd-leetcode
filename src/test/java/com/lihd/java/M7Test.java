package com.lihd.java;

import com.lihd.java.offer.M7;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 14:32
 **/
public class M7Test {


    @Test
    public void test() {

        M7 m7 = new M7();

        final TreeNode treeNode = m7.buildTree(new int[]{1, 2, 3}, new int[]{3, 2, 1});

        System.out.println(treeNode);


    }


}
