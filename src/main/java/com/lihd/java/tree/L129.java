package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 求根到叶子节点数字之和  https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 * @author: li_hd
 * @create: 2020-04-03 11:06
 **/
public class L129 {

    public int sumNumbers(TreeNode root) {

        return helper(root, 0);

    }


    private int helper(TreeNode treeNode, int sum) {

        if (treeNode == null)
            return 0;

        sum += treeNode.val;

        if (treeNode.left != null && treeNode.right != null) {
            return helper(treeNode.left, sum * 10) + helper(treeNode.right, sum * 10);
        } else if (treeNode.left != null) {
            return helper(treeNode.left, sum * 10);
        } else if (treeNode.right != null) {
            return helper(treeNode.right, sum * 10);
        } else {
            return sum;
        }


    }


}
