package com.lihd.java;

import com.lihd.java.dfs.L257;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-21 13:36
 **/
public class L257Test {


    @Test
    public void test(){

        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;


        L257 l257 = new L257();

        final List<String> list = l257.binaryTreePaths(treeNode1);

        System.out.println(list);


    }




}
