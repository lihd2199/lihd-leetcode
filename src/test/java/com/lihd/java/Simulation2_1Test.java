package com.lihd.java;

import com.lihd.java.simulation.Simulation2_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 10:10
 **/
public class Simulation2_1Test {

    @Test
    public void test(){

        Simulation2_1 simulation2_1 = new Simulation2_1();

        final int sum = simulation2_1.twoCitySchedCost(new int[][]{{259,770}, {448,54}, {926,667}, {184,139}, {840,118}, {577,469}});

        Assert.assertEquals(sum,76);


    }


}
