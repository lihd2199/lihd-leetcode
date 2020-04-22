package com.lihd.java.dfs;

import com.lihd.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的所有路径
 * @author: li_hd
 * @create: 2020-04-21 13:26
 **/
public class L257 {

    private List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        helper(root, new StringBuilder());

        return list;
    }

    private void helper(TreeNode node, StringBuilder stringBuilder) {

        if (node == null) {
            return;
        }


        if (node.left == null && node.right == null) {
            stringBuilder.append(node.val);
            list.add(stringBuilder.toString());
            return;
        }

        stringBuilder.append(node.val).append("->");

        if (node.left != null) {
            helper(node.left, new StringBuilder(stringBuilder));
        }

        if (node.right != null) {
            helper(node.right, new StringBuilder(stringBuilder));
        }


    }


}
