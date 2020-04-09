package com.lihd.java;

import com.lihd.java.offer.M4;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 13:47
 **/
public class M4Test {


    @Test
    public void test() {

        M4 m4 = new M4();

        final int[][] ints =
                {
                        {1, 4, 7, 11, 1},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}
                };

        Assert.assertTrue(m4.findNumberIn2DArray(ints,5));

        Assert.assertFalse(m4.findNumberIn2DArray(ints,15));

    }


}
