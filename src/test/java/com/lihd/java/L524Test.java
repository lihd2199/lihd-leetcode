package com.lihd.java;

import com.lihd.java.sample.L524;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-03 17:42
 **/
public class L524Test {


    @Test
    public void test(){

        L524 l524 = new L524();

        final String longestWord = l524.findLongestWord("abpcplea", Arrays.asList("a", "b", "b"));

        Assert.assertEquals(longestWord,"a");


    }


}
