package com.lihd.java;

import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 10:46
 **/
public class L542Test {

    @Test
    public void test(){

        L542 l542 = new L542();

        final int[][] ints = l542.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}});

        System.out.println(ints.length);


    }

}
