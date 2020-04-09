package com.lihd.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 路径总和II https://leetcode-cn.com/problems/path-sum-ii/
 * @author: li_hd
 * @create: 2020-04-02 17:49
 **/
public class L113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        thisSum = sum;
        helper2(root, 0, new LinkedList<>());
        return all;

    }

    private Integer thisSum;

    private List<List<Integer>> all = new ArrayList<>();

    //有点丑陋
    private void helper(TreeNode node, int sum, List<Integer> list) {

        if (node != null) {

            sum += node.val;
            list.add(node.val);

            if (sum == thisSum) {
                if (node.left == null && node.right == null) {
                    all.add(list);
                }
            }
            List<Integer> newList1 = new ArrayList<>(list);
            helper(node.left, sum, newList1);
            List<Integer> newList2 = new ArrayList<>(list);
            helper(node.right, sum, newList2);
        }


    }


    private void helper2(TreeNode node, int sum, LinkedList<Integer> list) {

        if (node != null) {
            sum += node.val;
            list.add(node.val);
            if (sum == thisSum) {
                if (node.left == null && node.right == null) {
                    all.add(new ArrayList<>(list));
                }
            }
            if(node.left != null){
                helper2(node.left, sum, list);
                list.removeLast();
            }
            if(node.right != null){
                helper2(node.right, sum, list);
                list.removeLast();
            }
        }


    }


}
