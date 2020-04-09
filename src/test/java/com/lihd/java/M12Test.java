package com.lihd.java;

import com.lihd.java.offer.M12;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-09 10:14
 **/
public class M12Test {


    @Test
    public void test() {

        M12 m12 = new M12();

        final boolean abcced = m12.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");

        Assert.assertTrue(abcced);


    }


}
