package com.lihd.java;

import com.lihd.java.recursive.L39;
import com.lihd.java.recursive.L39II;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 13:40
 **/
public class L39Test {


    @Test
    public void test() {


        L39 l39 = new L39();

        final List<List<Integer>> lists = l39.combinationSum(new int[]{2, 3, 6, 7}, 7);

        System.out.println(lists);

    }


    @Test
    public void test2() {


        L39II l39II = new L39II();

        final List<List<Integer>> lists = l39II.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        System.out.println(lists);


    }


    @Test
    public void test3() {

        final List<String> integers1 = Arrays.asList("s","w");

        final List<String> integers2 = Arrays.asList("s","w");

        System.out.println(integers1.hashCode());

        System.out.println(integers2.hashCode());

        System.out.println(integers1.equals(integers2));

        System.out.println(integers1 == integers2);


    }


}
