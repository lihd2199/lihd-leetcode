package com.lihd.java.tree;

/**
 * @program: lihd-leetcode
 * @description: 将有序数组转换为二叉搜索树 https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * @author: li_hd
 * @create: 2020-04-02 13:27
 **/
public class L108 {


    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(0, nums.length - 1, nums);
    }


    private TreeNode helper(int start, int end, int[] nums) {

        if (start > end)
            return null;

        int p = (end + start) / 2;
        TreeNode root = new TreeNode(nums[p]);

        //左树
        int leftStart = start;
        int leftEnd = p - 1;
        root.left = helper(leftStart, leftEnd, nums);

        //右树
        int rightStart = p + 1;
        int rightEnd = end;
        root.right = helper(rightStart, rightEnd, nums);

        return root;

    }


}
