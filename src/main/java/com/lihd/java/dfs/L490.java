package com.lihd.java.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-20 15:32
 **/
public class L490 {

    //遍历出 所有球能走到的点
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {


        Set<List<Integer>> set = new HashSet<>();

        final Integer[] starts = new Integer[2];
        starts[0] = start[0];
        starts[1] = start[1];

        return helper(set, maze, starts, destination);

    }

    private boolean helper(Set<List<Integer>> set, int[][] maze, Integer[] position, int[] destination) {

        List<Integer> list = new ArrayList<>(Arrays.asList(position));

        if (deal(position, destination))
            return true;

        if (set.add(list)) {

            final Integer[] up = getUp(maze, position);

            final Integer[] bottom = getBottom(maze, position);

            final Integer[] left = getLeft(maze, position);

            final Integer[] right = getRight(maze, position);

            return helper(set, maze, up, destination)
                    || helper(set, maze, bottom, destination)
                    || helper(set, maze, left, destination)
                    || helper(set, maze, right, destination);
        }
        return false;

    }

    private boolean deal(Integer[] up, int[] destination) {

        return up[0] == destination[0] && up[1] == destination[1];

    }


    private Integer[] getUp(int[][] maze, Integer[] position) {

        if (position[0] == 0)
            return position;

        for (int i = position[0] - 1; i > -1; i--) {
            //遇到墙
            if (maze[i][position[1]] == 1) {
                return new Integer[]{i + 1, position[1]};
            }
        }

        return new Integer[]{0, position[1]};

    }

    private Integer[] getBottom(int[][] maze, Integer[] position) {
        if (position[0] == maze.length - 1)
            return position;

        for (int i = position[0] + 1; i < maze.length; i++) {
            //遇到墙
            if (maze[i][position[1]] == 1) {
                return new Integer[]{i - 1, position[1]};
            }
        }

        return new Integer[]{maze.length - 1, position[1]};

    }

    private Integer[] getLeft(int[][] maze, Integer[] position) {
        if (position[1] == 0)
            return position;

        for (int i = position[1] - 1; i > -1; i--) {
            //遇到墙
            if (maze[position[0]][i] == 1) {
                return new Integer[]{position[0], i + 1};
            }
        }

        return new Integer[]{position[0], 0};
    }

    private Integer[] getRight(int[][] maze, Integer[] position) {
        if (position[1] == maze[0].length - 1)
            return position;

        for (int i = position[1] + 1; i < maze[0].length; i++) {
            //遇到墙
            if (maze[position[0]][i] == 1) {
                return new Integer[]{position[0], i - 1};
            }
        }

        return new Integer[]{position[0], maze[0].length - 1};

    }


}
