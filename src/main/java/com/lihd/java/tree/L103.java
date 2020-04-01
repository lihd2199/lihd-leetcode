package com.lihd.java.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的锯齿形层次遍历
 * @author: li_hd
 * @create: 2020-03-31 21:16
 **/
public class L103 {

    private List<List<Integer>> levels = new ArrayList<>();


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null) return levels;

        helper(root, 0);

        return levels;

    }


    private void helper(TreeNode node, int level) {

        if (levels.size() == level)
            levels.add(new ArrayList<>());

        final List<Integer> child = levels.get(level);

        if (level % 2 == 1) {
            child.add(0, node.val);
        } else {
            child.add(child.size(), node.val);
        }
        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }


    /**
     * 太丑陋
     */
    public List<List<Integer>> zigzagLevelOrderV2(TreeNode root) {

        if (root == null) return levels;

        final L102 l102 = new L102();

        l102.helper(root, 0);

        levels = l102.getLevels();

        for (int i = 0; i < levels.size(); i++) {

            if (i % 2 == 1) {
                levels.get(i).sort((o1, o2) -> o2 - o1);
            }

        }

        return levels;

    }


}
