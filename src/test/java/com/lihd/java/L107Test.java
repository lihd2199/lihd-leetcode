package com.lihd.java;

import com.lihd.java.tree.L107;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-01 19:46
 **/
public class L107Test {

    @Test
    public void test(){

        final TreeNode root = new TreeNode(1);

        final TreeNode root2 = new TreeNode(2);

        final TreeNode root3 = new TreeNode(3);

        root.left = root2;
        root.right = root3;

        L107 l107 = new L107();

        final List<List<Integer>> lists = l107.levelOrderBottom(root);

        System.out.println(lists);

    }


}
