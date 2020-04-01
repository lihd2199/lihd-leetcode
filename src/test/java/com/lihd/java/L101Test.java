package com.lihd.java;

import com.lihd.java.tree.L101;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description: 对称二叉树
 * @author: li_hd
 * @create: 2020-03-31 17:55
 **/
public class L101Test {


    @Test
    public void test() {

        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(2);
        root.left = root2;
        root.right = root3;

        final TreeNode root4 = new TreeNode(4);
        root4.left = root;


        L101 l101 = new L101();


        Assert.assertTrue(l101.isSymmetric(root));
        Assert.assertFalse(l101.isSymmetric(root4));

    }


}
