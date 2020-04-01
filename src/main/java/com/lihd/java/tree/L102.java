package com.lihd.java.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的层序遍历
 * @author: li_hd
 * @create: 2020-03-31 19:46
 **/
public class L102 {

    private List<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> getLevels() {
        return levels;
    }

    public void setLevels(List<List<Integer>> levels) {
        this.levels = levels;
    }

    public void helper(TreeNode node, int level) {

        if (levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(node.val);

        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return levels;

        helper(root, 0);

        return levels;

    }


}
