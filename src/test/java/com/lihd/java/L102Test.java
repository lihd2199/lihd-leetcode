package com.lihd.java;

import com.lihd.java.tree.L102;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的层序遍历
 * @author: li_hd
 * @create: 2020-03-31 20:58
 **/
public class L102Test {


    @Test
    public void test(){

        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(2);
        root.left = root2;
        root.right = root3;

        final L102 l102 = new L102();

        final List<List<Integer>> lists = l102.levelOrder(root);

        System.out.println(lists);


    }



}
