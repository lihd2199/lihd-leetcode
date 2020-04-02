package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 从中序与后序遍历序列构造二叉树
 * @author: li_hd
 * @create: 2020-04-01 17:27
 **/
public class L106 {


    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

    }


    //通过索引
    private TreeNode helper(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost) {

        if (inorder.length == 0)
            return null;


        if (startIn > endIn || startPost > endPost)
            return null;

        TreeNode root = new TreeNode(postorder[endPost]);

        //1  中序遍历   左树  位置
        int leftStartIn = startIn;
        int leftEndIn = leftStartIn;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[endPost]) {
                leftEndIn = i - 1;
                break;
            }
        }

        //2 后序遍历  左树
        int leftStartPost = startPost;
        int leftEndPost = leftStartPost + (leftEndIn - leftStartIn);

        root.left = helper(inorder, leftStartIn, leftEndIn, postorder, leftStartPost, leftEndPost);


        //3 中序遍历  右树 位置
        int rightEndIn = endIn;
        int rightStartIn = rightEndIn;
        for (int i = inorder.length - 1; i > -1; i--) {
            if (inorder[i] == postorder[endPost]) {
                rightStartIn = i + 1;
                break;
            }
        }

        //4 后序遍历  右树
        int rightStartPost = leftEndPost + 1;
        int rightEndPost = endPost - 1;

        root.right = helper(inorder, rightStartIn, rightEndIn, postorder, rightStartPost, rightEndPost);

        return root;

    }

}
