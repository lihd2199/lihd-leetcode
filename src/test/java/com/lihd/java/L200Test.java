package com.lihd.java;

import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-20 14:36
 **/
public class L200Test {

    @Test
    public void test(){

        L200 l200 = new L200();

        final int i = l200.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});

        System.out.println(i);


    }




}
