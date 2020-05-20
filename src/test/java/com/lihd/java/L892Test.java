package com.lihd.java;

import com.lihd.java.sample.L892;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-25 18:21
 **/
public class L892Test {



    @Test
    public void test(){

        L892 l892 = new L892();

        final int[] ints1 = {1,2};
        final int[] ints2 = {3,4};

        final int[][] intss = {ints1,ints2};

        final int i = l892.surfaceArea(intss);

        System.out.println(i);


    }



}
