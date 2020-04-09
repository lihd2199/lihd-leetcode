package com.lihd.java;

import com.lihd.java.tree.L112;
import org.junit.Assert;
import org.junit.Test;

import static com.lihd.java.L111Test.root1;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-02 17:05
 **/
public class L112Test {

    @Test
    public void test(){

        L112 l112 = new L112();

        Assert.assertTrue(l112.hasPathSum(root1,15));

    }


}
