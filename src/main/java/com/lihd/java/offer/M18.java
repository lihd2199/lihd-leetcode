package com.lihd.java.offer;

import com.lihd.java.tree.TreeNode;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-18 18:44
 **/
public class M18 {

    public void Mirror(TreeNode root) {

        helper(root);

    }
    private void helper(TreeNode node){
        if(node != null){
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            helper(node.left);
            helper(node.right);
        }
    }

}
