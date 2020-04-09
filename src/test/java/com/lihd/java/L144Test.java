package com.lihd.java;

import com.lihd.java.tree.L114;
import com.lihd.java.tree.L144;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 11:35
 **/
public class L144Test {


    @Test
    public void test(){


        L144 l114 = new L144();

        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;


        final List<Integer> list = l114.preorderTraversal(L111Test.root1);

        System.out.println(list);


    }



}
