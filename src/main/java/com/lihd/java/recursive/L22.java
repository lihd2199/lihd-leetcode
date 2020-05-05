package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-15 11:09
 **/
public class L22 {


    private List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        //所有的排列组合  ( 个数等于 ) 个数   每次到奇数的时候 (个数要大于偶的个数
        // ()(( ))))

        helper(n, n, new StringBuilder());

        return list;
    }


    private void helper(int i, int j, StringBuilder stringBuilder) {

        if (i > j) {
            return;
        }

        if (i != 0) {
            final StringBuilder left = new StringBuilder(stringBuilder);
            left.append("(");
            helper(i - 1, j, left);
        }

        if (j != 0) {
            final StringBuilder right = new StringBuilder(stringBuilder);
            right.append(")");
            helper(i, j - 1, right);
        }

        if (i == 0 && j == 0) {
            list.add(stringBuilder.toString());
        }

    }


}
