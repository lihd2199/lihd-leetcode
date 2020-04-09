package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 替换空格  https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @author: li_hd
 * @create: 2020-04-08 13:54
 **/
public class M5 {


    public String replaceSpace(String s) {

        int length = s.length();

        final char[] chars = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char t = s.charAt(i);
            if (t == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            }else{
                chars[size++] = t;
            }

        }

        return new String(chars, 0, size);

    }


}
