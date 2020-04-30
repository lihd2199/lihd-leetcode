package com.lihd.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 17:53
 **/
public class L3Test {


    @Test
    public void test(){

        L3 l3 = new L3();

        final int length = l3.lengthOfLongestSubstring("abcabcbb");

        Assert.assertEquals(length,3);


    }

}
