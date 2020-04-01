package com.lihd.java;

import com.lihd.java.tree.L100;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description: 相同的树
 * @author: li_hd
 * @create: 2020-03-31 17:35
 **/
public class L100Test {


    @Test
    public void test(){


        final TreeNode root = new TreeNode(1);
        final TreeNode root2 = new TreeNode(2);
        final TreeNode root3 = new TreeNode(3);
        final TreeNode root4 = new TreeNode(4);
        root2.left = root;
        root2.right = root4;
        root4.left = root3;

        L100 l100 = new L100();

        System.out.println(l100.isSameTree(root,root2));
        System.out.println(l100.isSameTree(root,root));


    }



}
