package com.lihd.java.dfs;

/**
 * @program: lihd-leetcode
 * @description: 填充每个节点的下一个右侧节点指针
 * @author: li_hd
 * @create: 2020-04-20 14:45
 **/
public class L116 {


    public Node connect(Node root) {

        if (root == null)
            return null;

        root.next = null;

        helper(root,root.right);

        helper(root, root.left);

        return root;
    }


    private void helper(Node parent, Node node) {

        if (node == null)
            return;

        //当前是左节点
        if (parent.left == node) {
            node.next = parent.right;
        }
        //当前是右节点
        if (parent.right == node) {
            if (parent.next != null) {
                node.next = parent.next.left;
            } else {
                node.next = null;
            }
        }

        helper(node, node.right);
        helper(node, node.left);

    }


    //node 如果是左节点 则找他父节点的右节点
    //node 如果是右节点 则找他父节点的next 的左节点


}
