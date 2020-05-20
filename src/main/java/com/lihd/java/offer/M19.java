package com.lihd.java.offer;

import java.util.*;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-05-18 18:52
 **/
public class M19 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        final ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        right(matrix, result, 0, 0, new HashSet<>());
        return result;
    }
    public void right(int[][] matrix, List<Integer> result, int x, int y, Set<List<Integer>> set) {
        final int value = matrix[x][y];
        result.add(value);
        set.add(Arrays.asList(x, y));
        if (y + 1 < matrix[0].length && !set.contains(Arrays.asList(x, y + 1))) {
            // confirm next step is correct
            right(matrix, result, x, y + 1, set);
        } else if (x + 1 < matrix.length && !set.contains(Arrays.asList(x + 1, y))) {
            // confirm next step is correct
            bottom(matrix, result, x + 1, y, set);
        }

    }
    public void bottom(int[][] matrix, List<Integer> result, int x, int y, Set<List<Integer>> set) {
        final int value = matrix[x][y];
        result.add(value);
        set.add(Arrays.asList(x, y));
        if (x + 1 < matrix.length && !set.contains(Arrays.asList(x + 1, y))) {
            // confirm next step is correct
            bottom(matrix, result, x + 1, y, set);
        } else if (y - 1 >= 0 && !set.contains(Arrays.asList(x, y - 1))) {
            left(matrix, result, x, y - 1, set);
        }
    }
    public void left(int[][] matrix, List<Integer> result, int x, int y, Set<List<Integer>> set) {
        final int value = matrix[x][y];
        result.add(value);
        set.add(Arrays.asList(x, y));
        if (y - 1 >= 0 && !set.contains(Arrays.asList(x, y - 1))) {
            left(matrix, result, x, y - 1, set);
        } else if (x - 1 >= 0 && !set.contains(Arrays.asList(x - 1, y))) {
            up(matrix, result, x - 1, y, set);
        }
    }
    public void up(int[][] matrix, List<Integer> result, int x, int y, Set<List<Integer>> set) {
        final int value = matrix[x][y];
        result.add(value);
        set.add(Arrays.asList(x, y));
        if (x - 1 >= 0 && !set.contains(Arrays.asList(x - 1, y))) {
            up(matrix, result, x - 1, y, set);
        } else if (y + 1 < matrix[0].length && !set.contains(Arrays.asList(x, y + 1))) {
            // confirm next step is correct
            right(matrix, result, x, y + 1, set);
        }
    }

}
