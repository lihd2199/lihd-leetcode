package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的最小深度  https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @author: li_hd
 * @create: 2020-04-02 16:35
 **/
public class L111 {

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        return helper(root, 1);

    }


    private int helper(TreeNode node, int level) {

        //保证当前不是null
        final TreeNode left = node.left;
        final TreeNode right = node.right;

        if (left == null && right == null) {
            return level;
        } else if (left == null) {
            return helper(right, level + 1);
        } else if (right == null) {
            return helper(left, level + 1);
        } else {
            return Math.min(helper(left, level + 1), helper(right, level + 1));
        }

    }


}
