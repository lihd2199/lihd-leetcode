package com.lihd.java;

import com.lihd.java.sample.L300;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 16:49
 **/
public class L300Test {


    @Test
    public void test(){

        L300 l300 = new L300();

        final int length = l300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});

        Assert.assertEquals(length,4);


    }

}
