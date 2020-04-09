package com.lihd.java.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 二叉树的前序遍历 https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @author: li_hd
 * @create: 2020-04-03 11:19
 **/
public class L144 {


    public List<Integer> preorderTraversal(TreeNode root) {

        helper(root);

        return list;

    }


    List<Integer> list = new ArrayList<>();

    private void helper(TreeNode node){


        if(node == null)
            return;


        helper(node.left);

        list.add(node.val);

        helper(node.right);

    }





}
