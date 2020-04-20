package com.lihd.java;

import com.lihd.java.simulation.Simulation5_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-20 11:27
 **/
public class Simulation5_1Test {


    @Test
    public void test() {


        Simulation5_1 simulation5_1 = new Simulation5_1();

        final int domino = simulation5_1.domino(3, 2, new int[][]{{1, 1}, {2, 1}});

        Assert.assertEquals(domino, 4);


    }


}
