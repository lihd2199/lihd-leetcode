package com.lihd.java;

import com.lihd.java.recursive.L39;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 13:40
 **/
public class L39Test {


    @Test
    public void test(){


        L39 l39 = new L39();

        final List<List<Integer>> lists = l39.combinationSum(new int[]{2, 3, 6, 7}, 7);

        System.out.println(lists);


    }



}
