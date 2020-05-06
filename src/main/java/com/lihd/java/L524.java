package com.lihd.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description: 通过删除字母匹配到字典里最长单词 https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
 * @author: li_hd
 * @create: 2020-05-03 17:16
 **/
public class L524 {


    public String findLongestWord(String s, List<String> d) {

        if (s == null || d == null)
            return null;

        //1、找到所有在的
        //2、找到最大的

        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            List<Integer> list = map.get(s.charAt(i));
            if (list == null) {
                list = new ArrayList<>();
                list.add(i);
                map.put(s.charAt(i), list);
            } else {
                list.add(i);
            }

        }


        String result = "";

        for (String tag : d) {

            if (tag == null)
                continue;
            if (tag.length() > s.length())
                continue;

            String s1 = helper(tag, map);

            if (s1 != null) {

                if (s1.length() == result.length()) {

                    result = result.compareTo(s1) < 0 ? result : s1;
                } else if (s1.length() > result.length()) {

                    result = s1;
                }

            }

        }

        return result;


    }


    private String helper(String tag, Map<Character, List<Integer>> map) {

        boolean yes = true;

        //上一个char的索引 要在下一个之后
        int smallIndex = -1;
        for (int i = 0; i < tag.length(); i++) {
            //不存在
            final List<Integer> list = map.get(tag.charAt(i));
            if (list == null || list.isEmpty()) {
                yes = false;
                break;
            } else {
                boolean no = false;
                for (Integer integer : list) {
                    //这个索引大于上一个的索引
                    if (integer > smallIndex) {
                        smallIndex = integer;
                        no = true;
                        break;
                    }
                }
                if (!no) {
                    //没有大于的时候 就说明当前词有问题 直接break
                    yes = false;
                    break;
                }
            }
        }

        if (!yes) {
            return null;
        } else {
            return tag;
        }


    }


}
