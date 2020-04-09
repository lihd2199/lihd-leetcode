package com.lihd.java.offer;


import com.lihd.java.tree.TreeNode;

/**
 * @program: lihd-leetcode
 * @description: 重建二叉树 https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 * @author: li_hd
 * @create: 2020-04-08 14:11
 **/
public class M7 {

    private int[] preorder;

    private int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) return null;

        this.preorder = preorder;
        this.inorder = inorder;

        return helper(0, preorder.length - 1, 0, inorder.length - 1);

    }

    /**
     * @param preleft  前序遍历 left
     * @param preright 前序遍历 right
     * @param inleft   中序遍历 left
     * @param inright  中序遍历 right
     * @return
     */
    private TreeNode helper(int preleft, int preright, int inleft, int inright) {


        if (preright < preleft || inright < inleft)
            return null;

        final TreeNode root = new TreeNode(preorder[preleft]);

        //左树 前序遍历 left
        int leftpreleft = preleft + 1;
        //左树 前序遍历 right
        int incenter = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                incenter = i;
                break;
            }
        }
        int leftpreright = leftpreleft + incenter - inleft - 1;
        //左树 中序遍历 left
        int leftinleft = inleft;
        //左树 中序遍历 right
        int leftinright = incenter - 1;

        root.left = helper(leftpreleft, leftpreright, leftinleft, leftinright);


        //右树 前序遍历 left
        int rightpreleft = leftpreright + 1;
        //右树 前序遍历 right
        int rightpreright = preright;
        //右树 中序遍历 left
        int rightinleft = incenter + 1;
        //右树 中序遍历 right;
        int rightinright = inright;

        root.right = helper(rightpreleft, rightpreright, rightinleft, rightinright);

        return root;

    }


}
