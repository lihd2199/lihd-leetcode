package com.lihd.java.offer;

import java.util.Stack;

/**
 * @program: lihd-leetcode
 * @description: 矩阵中的路径 https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 * @author: li_hd
 * @create: 2020-04-08 19:04
 **/
public class M12 {

    private Stack<String> coordinates;
    private String word;
    private char[][] board;

    public boolean exist(char[][] board, String word) {

        if (word == null)
            return false;
        if (board == null || board.length == 0)
            return false;

        this.coordinates = new Stack<>();
        this.word = word;
        this.board = board;

        final boolean helper = helper(0);

        System.out.println(coordinates);

        return helper;

    }

    //每一次都可能有好几个  这就很烦了
    private boolean helper(int index) {

        if (index >= word.length())
            return true;

        //如果是空 那就是先找第一个
        if (coordinates.isEmpty()) {
            for (int i = 0; i < board.length; i++) {
                final char[] chars = board[i];
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == word.charAt(index)) {
                        coordinates.push(i + "," + j);
                        if (!helper(index + 1)) {
                            coordinates.pop();
                        } else {
                            return true;
                        }
                    }
                }
            }

        } else {

            final String[] peek = coordinates.peek().split(",");
            int i = Integer.parseInt(peek[0]);
            int j = Integer.parseInt(peek[1]);
            if (i - 1 >= 0 && board[i - 1][j] == word.charAt(index) && !coordinates.contains(i - 1 + "," + j)) {
                coordinates.push(i - 1 + "," + j);
                if (!helper(index + 1)) {
                    coordinates.pop();
                } else {
                    return true;
                }
            }
            if (i + 1 < board.length && board[i + 1][j] == word.charAt(index) && !coordinates.contains(i + 1 + "," + j)) {
                coordinates.push(i + 1 + "," + j);
                if (!helper(index + 1)) {
                    coordinates.pop();
                } else {
                    return true;
                }
            }
            if (j - 1 >= 0 && board[i][j - 1] == word.charAt(index) && !coordinates.contains(i + "," + (j - 1))) {
                coordinates.push(i + "," + (j - 1));
                if (!helper(index + 1)) {
                    coordinates.pop();
                } else {
                    return true;
                }
            }
            if (j + 1 < board[0].length) {
                if (board[i][j + 1] == word.charAt(index)) {
                    if (!coordinates.contains(i + "," + (j + 1))) {
                        coordinates.push(i + "," + (j + 1));
                        if (!helper(index + 1)) {
                            coordinates.pop();
                        } else {
                            return true;
                        }
                    }
                }

            }

        }

        return false;

    }
}
