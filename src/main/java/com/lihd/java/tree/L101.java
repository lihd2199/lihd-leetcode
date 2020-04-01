package com.lihd.java.tree;


/**
 * @program: lihd-leetcode
 * @description: 对称二叉树
 * @author: li_hd
 * @create: 2020-03-31 17:40
 **/
public class L101 {

    public boolean isSymmetric(TreeNode root) {

        return isRightEqualLeft(root.left, root.right);

    }


    //递归
    public boolean isRightEqualLeft(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;

        if (left != null && right != null && left.val == right.val)
            return isRightEqualLeft(left.left, right.right) && isRightEqualLeft(left.right, right.left);

        return false;

    }







}
