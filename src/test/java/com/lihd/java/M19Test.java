package com.lihd.java;

import com.lihd.java.offer.M19;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-18 19:31
 **/
public class M19Test {

    @Test
    public void test() {
        M19 m19 = new M19();
        final ArrayList<Integer> integers = m19.printMatrix(new int[][]{{1},{2},{3},{4},{5}});
        System.out.println(integers);
    }

}
