package com.lihd.java;

import com.lihd.java.tree.L108;
import com.lihd.java.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-02 13:40
 **/
public class L108Test {


    @Test
    public void test(){

        L108 l108 = new L108();


        final TreeNode treeNode = l108.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

        Assert.assertEquals(0,treeNode.val);


    }




}
