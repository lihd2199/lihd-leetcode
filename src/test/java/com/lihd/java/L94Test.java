package com.lihd.java;

import com.lihd.java.tree.L94;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树中序遍历
 * @author: li_hd
 * @create: 2020-03-25 18:45
 **/
public class L94Test {


    @Test
    public void test() {

        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(3);
        root.right = root2;
        root2.left = root3;

        final L94 l94 = new L94();
        final List<Integer> list = l94.inorderTraversal2(root);

        System.out.println(list);

    }


}
