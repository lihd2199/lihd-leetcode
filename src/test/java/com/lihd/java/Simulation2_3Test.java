package com.lihd.java;

import com.lihd.java.simulation.Simulation2_3;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 10:58
 **/
public class Simulation2_3Test {

    @Test
    public void test(){

        Simulation2_3 simulation2_3 = new Simulation2_3();
        final int i = simulation2_3.kConcatenationMaxSum(new int[]{-5,4,-4,-3,5,-3}, 2);
        Assert.assertEquals(i,5);

    }


}
