package com.lihd.java.dfs;

import com.lihd.java.tree.TreeNode;


/**
 * @program: lihd-leetcode
 * @description: 打家劫舍 III
 * @author: li_hd
 * @create: 2020-04-20 17:11
 **/
public class L337 {


    public int rob(TreeNode root) {

        if (root == null)
            return 0;


        final int val = root.val;

        final TreeNode left = root.left;
        final TreeNode right = root.right;

        int children2 = 0;
        int children3 = 0;

        if (left != null) {
            children2 += rob(left.left) + rob(left.right);

            if (left.left != null) {
                children3 += rob(left.left.left) + rob(left.left.right);
            }
            if (left.right != null) {
                children3 += rob(left.right.left) + rob(left.right.right);
            }

        }

        if (right != null) {
            children2 += rob(right.left) + rob(right.right);

            if (right.left != null) {
                children3 += rob(right.left.left) + rob(right.left.right);
            }
            if (right.right != null) {
                children3 += rob(right.right.left) + rob(right.right.right);
            }
        }

        return val + Math.max(children2, children3);


    }


}
