package com.lihd.java;

import com.lihd.java.sample.M0805;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-03-31 21:50
 **/
public class M0805Test {


    @Test
    public void test(){


        final M0805 m0805 = new M0805();

        final int multiply = m0805.multiply(200000000, 2);

        Assert.assertEquals(multiply,400000000);


    }


}
