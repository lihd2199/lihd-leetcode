package com.lihd.java;

import com.lihd.java.dfs.L490;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-20 16:10
 **/
public class L490Test {

    @Test
    public void test(){

        L490 l490 = new L490();

        final int[][] maze = {{0,0,1,0,0}, {0,0,0,0,0}, {0,0,0,1,0}, {1,1,0,1,1}, {0,0,0,0,0}};

        final boolean b = l490.hasPath(maze, new int[]{0, 4}, new int[]{4, 4});

        Assert.assertTrue(b);


    }


}
