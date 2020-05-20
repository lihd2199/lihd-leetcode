package com.lihd.java;

import com.lihd.java.sample.L983;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description: []
 * []
 * @author: li_hd
 * @create: 2020-05-06 17:59
 **/
public class L983Test {

    @Test
    public void test(){

        L983 l983 = new L983();


        final int result = l983.mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{7,2,15});

        Assert.assertEquals(result,6);

    }


}
