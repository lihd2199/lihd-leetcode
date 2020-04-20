package com.lihd.java;

/**
 * @program: lihd-leetcode
 * @description: 岛屿数量
 * @author: li_hd
 * @create: 2020-04-20 13:29
 **/
public class L200 {


    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;


        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            final char[] chars = grid[i];
            for (int j = 0; j < chars.length; j++) {
                final char aChar = chars[j];
                if (aChar == '1') {
                    helper(grid, i, j);
                    max += 1;
                }
            }
        }

        return max;

    }

    private void helper(char[][] grid, int i, int j) {

        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 2;

        if (i != 0) {
            helper(grid, i - 1, j);
        }

        if (i != grid.length - 1) {
            helper(grid, i + 1, j);
        }

        if (j != 0) {
            helper(grid, i, j - 1);
        }

        if (j != grid[0].length - 1) {
            helper(grid, i, j + 1);
        }

    }


}
