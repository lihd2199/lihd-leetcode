package com.lihd.java;

import com.lihd.java.dp.L55;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 14:20
 **/
public class L55Test {


    @Test
    public void test() {

        L55 l55 = new L55();

        Assert.assertTrue(l55.canJump(new int[]{2,3,1,1,4}));

        Assert.assertFalse(l55.canJump(new int[]{3, 2, 1, 0, 4}));


    }


}
