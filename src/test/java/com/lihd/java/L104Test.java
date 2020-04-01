package com.lihd.java;

import com.lihd.java.tree.L104;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的最大深度
 * @author: li_hd
 * @create: 2020-03-31 22:12
 **/
public class L104Test {

    @Test
    public void test(){

        final L104 l104 = new L104();


        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(3);
        root.left = root2;
//        root.right = root3;

        final TreeNode root4 = new TreeNode(4);
        final TreeNode root5 = new TreeNode(5);
        root2.left = root4;
        root3.right=root5;


        Assert.assertEquals(l104.maxDepth(root),3);



    }


}
