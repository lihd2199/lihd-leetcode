package com.lihd.java.tree;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description: 从前序与中序遍历序列构造二叉树
 * @author: li_hd
 * @create: 2020-04-01 15:58
 **/
public class L105 {


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    //通过索引
    private TreeNode helper(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {

        if (preorder.length == 0)
            return null;


        if (startPre > endPre || startIn > endIn)
            return null;


        TreeNode root = new TreeNode(preorder[startPre]);

        //1  中序遍历   左树  位置
        int leftStartIn = startIn;
        int leftEndIn = leftStartIn;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[startPre]) {
                leftEndIn = i - 1;
                break;
            }
        }
        //2 前序遍历  左树
        int leftStartPre = startPre + 1;
        int leftEndPre = leftStartPre + (leftEndIn - leftStartIn);

        root.left = helper(preorder, leftStartPre, leftEndPre, inorder, leftStartIn, leftEndIn);


        //3 中序遍历  右树 位置
        int rightEndIn = endIn;
        int rightStartIn = rightEndIn;
        for (int i = inorder.length - 1; i > -1; i--) {
            if (inorder[i] == preorder[startPre]) {
                rightStartIn = i + 1;
                break;
            }
        }

        //4 前序遍历  右树
        int rightStartPre = leftEndPre + 1;
        int rightEndPre = endPre;

        root.right = helper(preorder, rightStartPre, rightEndPre, inorder, rightStartIn, rightEndIn);

        return root;

    }


    //太慢  不用list 用索引
    private TreeNode helper(List<Integer> preorder, List<Integer> inorder) {

        final List<Integer> leftPre = new ArrayList<>();
        final List<Integer> rightPre = new ArrayList<>();

        final List<Integer> leftIn = new ArrayList<>();
        final List<Integer> rightIn = new ArrayList<>();

        if (!preorder.isEmpty()) {

            final TreeNode root = new TreeNode(preorder.get(0));

            //左右树的中序遍历
            boolean flag = true;
            for (Integer integer : inorder) {
                if (integer.equals(root.val)) {
                    flag = false;
                    continue;
                }
                if (flag) {
                    leftIn.add(integer);
                }
                if (!flag) {
                    rightIn.add(integer);
                }
            }

            //顺序不同 但是内容相同
            for (Integer integer : preorder) {
                if (leftIn.contains(integer)) {
                    leftPre.add(integer);
                }
                if (rightIn.contains(integer)) {
                    rightPre.add(integer);
                }
            }

            root.left = helper(leftPre, leftIn);
            root.right = helper(rightPre, rightIn);

            return root;
        } else {
            return null;
        }

    }


}
