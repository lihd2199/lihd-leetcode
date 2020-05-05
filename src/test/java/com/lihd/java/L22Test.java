package com.lihd.java;

import com.lihd.java.recursive.L22;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 11:28
 **/
public class L22Test {



    @Test
    public void test(){

        L22 l22 = new L22();

        final List<String> list = l22.generateParenthesis(3);

        System.out.println(list);


    }


}
