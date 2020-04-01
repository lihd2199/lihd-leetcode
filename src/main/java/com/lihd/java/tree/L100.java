package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 相同的树
 * @author: li_hd
 * @create: 2020-03-31 17:30
 **/
public class L100 {


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;


        if (p != null && q != null && p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


        return false;

    }


}
