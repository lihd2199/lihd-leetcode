package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-08 13:29
 **/
public class M4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0)
            return false;

        int i = matrix.length - 1;
        int n = 0;

        while (i > -1 && n != matrix[0].length) {

            int standard = matrix[i][n];

            if (target > standard) {
                n = n + 1;
            }
            if (target == standard) {
                return true;
            }
            if (target < standard) {
                i = i - 1;
            }

        }

        return false;
    }


}
