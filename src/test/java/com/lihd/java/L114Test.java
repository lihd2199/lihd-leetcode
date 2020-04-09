package com.lihd.java;

import com.lihd.java.tree.L114;
import com.lihd.java.tree.TreeNode;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 10:26
 **/
public class L114Test {

    @Test
    public void test(){

        L114 l114 = new L114();


        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        root1.left = root2;
        root2.left = root3;
        root2.right = root4;

        root1.right = root5;
        root5.right = root6;


        l114.flatten(root1);

        System.out.println(root1);

    }



}
