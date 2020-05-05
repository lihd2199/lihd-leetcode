package com.lihd.java;

import com.lihd.java.recursive.L46;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 15:03
 **/
public class L46Test {


    @Test
    public void test(){


        L46 l46 = new L46();

        final List<List<Integer>> permute = l46.permute(new int[]{1, 2, 3});

        System.out.println(permute);


    }



}
