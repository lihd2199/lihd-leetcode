package com.lihd.java.dfs;

/**
 * @program: lihd-leetcode
 * @description: 被围绕的区域
 * @author: li_hd
 * @create: 2020-04-20 15:13
 **/
public class L130 {


    public void solve(char[][] board) {

        if (board == null || board.length == 0)
            return;

        for (int i = 0; i < board.length; i++) {
            final char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                final char aChar = chars[j];
                if (i == 0 || j == 0 || i == board.length - 1 || j == chars.length - 1) {
                    if (aChar == 'O') {
                        helper(i, j, board);
                    }
                }
            }
        }

        changeOToX(board);
        changeTToO(board);


    }

    private void changeTToO(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            final char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                final char aChar = chars[j];
                if (aChar == 'T') {
                    board[i][j] = 'O';
                }

            }
        }
    }

    private void changeOToX(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            final char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                final char aChar = chars[j];
                if (aChar == 'O') {
                    board[i][j] = 'X';
                }

            }
        }
    }

    private void helper(int i, int j, char[][] board) {

        if (board[i][j] != 'O')
            return;

        board[i][j] = 'T';

        if (i != 0) {
            helper(i - 1, j, board);
        }
        if (j != 0) {
            helper(i, j - 1, board);
        }
        if (i != board.length - 1) {
            helper(i + 1, j, board);
        }
        if (j != board[0].length - 1) {
            helper(i, j + 1, board);
        }


    }


}
