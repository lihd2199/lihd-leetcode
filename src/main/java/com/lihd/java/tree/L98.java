package com.lihd.java.tree;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 验证二叉搜索树
 * @author: li_hd
 * @create: 2020-03-25 20:17
 **/
public class L98 {


    /**
     * 中序遍历 按顺序
     */

    public boolean isValidBST(TreeNode root) {

        return deal(root);

    }

    private Integer pre = null;

    private boolean deal(TreeNode crry) {

        Stack<TreeNode> stack = new Stack<>();
        while (crry != null || !stack.isEmpty()) {
            while (crry != null) {
                stack.push(crry);
                crry = crry.left;
            }

            final TreeNode pop = stack.pop();

            if (pre == null) {
                pre = pop.val;
            } else if (pop.val <= pre) {
                return false;
            }
            pre = pop.val;
            crry = pop.right;

        }

        return true;
    }



}
