package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的最大深度
 * @author: li_hd
 * @create: 2020-03-31 22:06
 **/
public class L104 {

    public int maxDepth(TreeNode root) {

        return helper(root, 1);

    }


    private int helper(TreeNode treeNode, int level) {

        if (treeNode == null)
            return level - 1;

        return Math.max(helper(treeNode.left, level + 1), helper(treeNode.right, level + 1));

    }


}
