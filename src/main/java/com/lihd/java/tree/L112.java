package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 路径总和 https://leetcode-cn.com/problems/path-sum/
 * @author: li_hd
 * @create: 2020-04-02 16:57
 **/
public class L112 {

    private Integer thisSum;

    public boolean hasPathSum(TreeNode root, int sum) {

        thisSum = sum;
        return helper(root, 0);

    }

    private boolean helper(TreeNode node, int sum) {

        if (node != null) {
            sum += node.val;
            if (node.left == null && node.right == null) {
                return sum == thisSum;
            }

            return helper(node.left, sum) || helper(node.right, sum);
        }

        return false;


    }


}
