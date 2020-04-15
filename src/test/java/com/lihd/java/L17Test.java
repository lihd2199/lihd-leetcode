package com.lihd.java;

import com.lihd.java.recursive.L17;
import org.junit.Test;

import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 09:52
 **/
public class L17Test {


    @Test
    public void test() {


        L17 l17 = new L17();

        final List<String> list = l17.letterCombinations("233");

        System.out.println(list);


    }

}
