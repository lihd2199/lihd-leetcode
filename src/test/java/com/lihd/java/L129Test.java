package com.lihd.java;

import com.lihd.java.tree.L129;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 11:15
 **/
public class L129Test {

    @Test
    public void test(){

        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        L129 l129 = new L129();

        Assert.assertEquals(l129.sumNumbers(treeNode1),1026);


    }


}
