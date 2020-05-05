package com.lihd.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 19:09
 **/
public class L33Test {

    @Test
    public void test() {

        L33 l33 = new L33();

        final int search = l33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

        Assert.assertEquals(search,4);


    }


}
