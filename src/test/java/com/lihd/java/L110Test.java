package com.lihd.java;

import com.lihd.java.tree.L110;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-02 16:12
 **/
public class L110Test {

    @Test
    public void test(){

        L110 l110 = new L110();

        final TreeNode root1 = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root22 = new TreeNode(2);

        final TreeNode root3 = new TreeNode(3);
        final TreeNode root33 = new TreeNode(3);
        final TreeNode root333 = new TreeNode(3);
        final TreeNode root3333 = new TreeNode(3);


        final TreeNode root4 = new TreeNode(4);
        final TreeNode root44 = new TreeNode(4);
        final TreeNode root444 = new TreeNode(4);
        final TreeNode root4444 = new TreeNode(4);
        final TreeNode root44444 = new TreeNode(4);
        final TreeNode root444444 = new TreeNode(4);

        final TreeNode root5 = new TreeNode(5);
        final TreeNode root55 = new TreeNode(5);


        root1.left = root2;
        root1.right = root22;

        root2.left = root3;
        root2.right = root33;

        root22.left = root333;
        root22.right = root3333;


        root3.left = root4;
        root3.right = root44;

        root33.left = root444;
        root33.right = root4444;

        root333.left = root44444;
        root333.right = root444444;

        root44.left = root5;
        root44.right = root55;


        Assert.assertFalse(l110.isBalanced(root1));


    }


}
