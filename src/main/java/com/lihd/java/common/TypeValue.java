package com.lihd.java.common;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 15:37
 **/
public enum TypeValue {

    dp("动态规划"),

    recursive("递归"),

    greedy("贪心"),

    backtracking("回溯法");

    private String name;

    TypeValue(String name){
        this.name = name;
    }

}
