package com.lihd.java.offer;

import com.lihd.java.tree.TreeNode;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 重建二叉树 https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/ 迭代的方法
 * @author: li_hd
 * @create: 2020-04-08 15:15
 **/
public class M7II {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) return null;

        return null;
    }


    private TreeNode helper(int[] preorder, int inorder) {

        int i = 0;

        Stack<Integer> stack = new Stack<>();
        while (i<preorder.length || !stack.isEmpty()){
            for(int j=0;j<preorder.length;j++){
                stack.push(preorder[i]);
            }
            i++;

        }

        return null;
    }


}
