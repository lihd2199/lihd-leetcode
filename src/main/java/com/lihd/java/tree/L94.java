package com.lihd.java.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的中序遍历
 * @author: li_hd
 * @create: 2020-03-25 18:39
 **/
public class L94 {


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        deal(root, list);

        return list;
    }

    private void deal(TreeNode root, List<Integer> list) {

        if (root == null)
            return;

        deal(root.left, list);

        list.add(root.val);

        deal(root.right, list);

    }

    /**
     * 栈的方法
     */
    //todo 偶尔看一下  栈的思想
    public List<Integer> inorderTraversal2(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;

    }

}
