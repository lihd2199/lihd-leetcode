package com.lihd.java;

import com.lihd.java.offer.M13;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 11:21
 **/
public class M13Test {


    @Test
    public void test() {

        M13 m13 = new M13();

        Assert.assertEquals(m13.movingCount(16, 8, 4),15);

    }


}
