package com.lihd.java.sample;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 09:59
 **/
public class L542 {


    //todo 这题不对
    public int[][] updateMatrix(int[][] matrix) {


        if (matrix == null) {
            return null;
        }

        if (matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }

        int[][] result = new int[matrix.length][matrix[0].length];

        this.matrix = matrix;

        for (int i = 0; i < matrix.length; i++) {
            final int[] matrix1 = matrix[i];
            for (int i1 = 0; i1 < matrix1.length; i1++) {
                result[i][i1] = helper(i, i1, 0);
            }
        }

        return result;

    }

    private int[][] matrix;

    private Integer helper(int i, int j, Integer value) {

        if (matrix[i][j] == 0) {
            return value;
        } else {
            Integer count = 0;
            if (i != 0) {
                count = helper(i - 1, j, value + 1);
            }
            if (j != 0) {
                final Integer left = helper(i, j - 1, value + 1);
                count = count == 0 ? left : Math.min(left, count);
            }
            if (i != matrix.length - 1) {
                final Integer up = helper(i + 1, j, value + 1);
                count = count == 0 ? up : Math.min(up, count);
            }
            if (j != matrix[0].length - 1) {
                final Integer right = helper(i, j + 1, value + 1);
                count = count == 0 ? right : Math.min(right, count);
            }
            return count;
        }
    }


}
