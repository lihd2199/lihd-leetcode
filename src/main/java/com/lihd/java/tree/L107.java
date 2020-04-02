package com.lihd.java.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的层次遍历 II
 * @author: li_hd
 * @create: 2020-04-01 18:06
 **/
public class L107 {


    private LinkedList<List<Integer>> ans;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ans = new LinkedList<>();
        getOrder(root, 1);
        return ans;
    }

    private void getOrder(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() < level)
            ans.addFirst(new LinkedList<>());
        List<Integer> subList = ans.get(ans.size() - level);
        subList.add(root.val);
        getOrder(root.left, level + 1);
        getOrder(root.right, level + 1);
    }


}
