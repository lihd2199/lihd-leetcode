package com.lihd.java.sample;


/**
 * @program: lihd-leetcode
 * @description: 三维形体的表面积
 * @author: li_hd
 * @create: 2020-03-25 16:23
 **/
public class L892 {

    public int surfaceArea(int[][] grid) {

        int count = 0;
        int length = grid.length;
        for (int i = 0; i < grid.length; i++) {
            int[] ints = grid[i];
            int width = ints.length;
            for (int j = 0; j < ints.length; j++) {
                int num = grid[i][j];
                if (num == 0) {
                    count += 0;
                    continue;
                }
                count += num * 6 - (num - 1) * 2;
                int up = length == i + 1 ? 0 : grid[i + 1][j];
                int right = width == j + 1 ? 0 : grid[i][j + 1];
                count -= Math.min(num, up) * 2;
                count -= Math.min(num, right) * 2;
            }
        }
        return count;

    }


}
