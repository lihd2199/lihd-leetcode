package com.lihd.java;

import com.lihd.java.offer.M9;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 16:18
 **/
public class M9Test {

    @Test
    public void test(){

        M9 m9 = new M9();

        Assert.assertEquals(m9.deleteHead(),-1);

        m9.appendTail(5);

        m9.appendTail(2);

        Assert.assertEquals(m9.deleteHead(),5);

        Assert.assertEquals(m9.deleteHead(),2);

        Assert.assertEquals(m9.deleteHead(),-1);


    }



}
