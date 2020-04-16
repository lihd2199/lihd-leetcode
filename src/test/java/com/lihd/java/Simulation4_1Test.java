package com.lihd.java;

import com.lihd.java.simulation.Simulation4_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-16 19:13
 **/
public class Simulation4_1Test {

    @Test
    public void test(){

        Simulation4_1 simulation4_1 = new Simulation4_1();

        final int lengthOfLCIS = simulation4_1.findLengthOfLCIS(new int[]{2,2,2,2,2});

        Assert.assertEquals(lengthOfLCIS,1);


    }


}
