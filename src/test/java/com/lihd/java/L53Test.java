package com.lihd.java;

import com.lihd.java.dp.L53;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 16:46
 **/
public class L53Test {

    @Test
    public void test() {
        L53 l53 = new L53();
        Assert.assertEquals(l53.maxSubArrayV2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}),6);
    }


}
