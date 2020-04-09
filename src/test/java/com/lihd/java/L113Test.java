package com.lihd.java;

import com.lihd.java.tree.L113;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-02 18:15
 **/
public class L113Test {



    @Test
    public void test(){

        L113 l113 = new L113();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);


        final List<List<Integer>> lists = l113.pathSum(treeNode, 3);

        Assert.assertEquals(2,lists.size());


    }



}
