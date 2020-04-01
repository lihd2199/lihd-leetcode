package com.lihd.java;

import com.lihd.java.tree.L98;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-26 21:24
 **/
public class L98Test {

    @Test
    public void test(){


        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(3);
        final TreeNode root4 = new TreeNode(4);
        root2.left = root;
        root2.right = root4;
        root4.left = root3;

        L98 l98 = new L98();
        final boolean flag = l98.isValidBST(root2);

        System.out.println(flag);
    }


}
