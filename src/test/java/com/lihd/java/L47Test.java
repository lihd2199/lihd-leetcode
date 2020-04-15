package com.lihd.java;

import com.lihd.java.recursive.L47;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 15:12
 **/
public class L47Test {


    @Test
    public void test(){

        L47 l47 = new L47();

        final List<List<Integer>> lists = l47.permuteUnique(new int[]{1, 1, 2});

        System.out.println(lists);


    }


}
