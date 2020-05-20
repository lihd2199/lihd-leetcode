package com.lihd.java;

import com.lihd.java.offer.M21;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-18 20:17
 **/
public class M21Test {

    @Test
    public void test() {
        M21 m21 = new M21();
        final boolean b = m21.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        assertTrue(b);
    }

}
