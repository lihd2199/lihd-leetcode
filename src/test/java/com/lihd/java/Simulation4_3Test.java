package com.lihd.java;

import com.lihd.java.simulation.Simulation4_3;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-16 19:40
 **/
public class Simulation4_3Test {

    @Test
    public void test() {

        Simulation4_3 simulation4_3 = new Simulation4_3();

        final String h2O = simulation4_3.countOfAtoms("((HHe28Be26He)9)34");

        System.out.println(h2O);


    }


}
