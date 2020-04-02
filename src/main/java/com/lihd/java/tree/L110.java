package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 平衡二叉树 https://leetcode-cn.com/problems/balanced-binary-tree/
 * @author: li_hd
 * @create: 2020-04-02 15:34
 **/
public class L110 {


    public boolean isBalanced(TreeNode root) {

        final int max = helper(root, 0);

        final int min = helper2(root, 0);

        System.out.println(max);

        System.out.println(min);

        return max - min < 2;

    }


    private int helper(TreeNode treeNode, int level) {

        if (treeNode == null)
            return level;

        return Math.max(helper(treeNode.left, level + 1), helper(treeNode.right, level + 1));

    }

    private int helper2(TreeNode treeNode, int level) {

        if (treeNode == null)
            return level;

        return Math.min(helper2(treeNode.left, level + 1), helper2(treeNode.right, level + 1));

    }


}
