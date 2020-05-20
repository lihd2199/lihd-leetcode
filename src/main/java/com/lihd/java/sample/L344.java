package com.lihd.java.sample;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 14:36
 **/
public class L344 {

    public void reverseString(char[] s) {

        final int length = s.length;

        for (int i = 0; i < length / 2; i++) {

            char tmp = s[length - 1 - i];

            s[length - 1 -i] = s[i];

            s[i] = tmp;

        }


    }


}
