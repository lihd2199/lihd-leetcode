package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 二叉树展开为链表  https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @author: li_hd
 * @create: 2020-04-03 09:51
 **/
public class L114 {


    public void flatten(TreeNode root) {
        if (root == null)
            return;
        helper(root);
    }


    private void helper(TreeNode node) {

        TreeNode right = node.right;
        TreeNode left = node.left;

        if (left != null) {

            node.right = left;
            node.left = null;
            helper(left);

            if (right != null) {
                TreeNode tmp = left.right;
                TreeNode tmp2 = left;
                while (tmp != null) {
                    tmp2 = tmp;
                    tmp = tmp.right;
                }
                tmp2.right = right;

                helper(right);
            }

        }

        if(left == null && right != null){
            helper(right);
        }


    }


}
