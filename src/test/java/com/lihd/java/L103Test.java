package com.lihd.java;

import com.lihd.java.tree.L103;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的锯齿形层次遍历
 * @author: li_hd
 * @create: 2020-03-31 21:22
 **/
public class L103Test {

    @Test
    public void test(){

        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(3);
        root.left = root2;
        root.right = root3;

        final TreeNode root4 = new TreeNode(4);
        final TreeNode root5 = new TreeNode(5);
        root2.left = root4;
        root3.right=root5;


        final L103 l103 = new L103();

        final List<List<Integer>> lists = l103.zigzagLevelOrder(root);

        System.out.println(lists);


    }


}
