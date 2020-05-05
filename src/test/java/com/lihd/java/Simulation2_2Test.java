package com.lihd.java;

import com.lihd.java.simulation.Simulation2_2;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 10:28
 **/
public class Simulation2_2Test {


    @Test
    public void test() {

        Simulation2_2 simulation2_2 = new Simulation2_2();

        final int[] ints = simulation2_2.decompressRLElist(new int[]{1, 2, 3, 4});

        final List<Integer> list = Arrays.asList(2, 4, 4, 4);

        Assert.assertEquals(ints.length, list.size());

        for (int i = 0; i < ints.length; i++) {

            Assert.assertEquals(list.get(i).intValue(), ints[i]);

        }


    }


}
