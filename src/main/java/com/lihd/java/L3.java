package com.lihd.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-30 17:38
 **/
public class L3 {

    public int lengthOfLongestSubstring(String s) {

        if (s == null)
            return -1;

        if (s.length() == 0 || s.length() == 1)
            return s.length();

        Integer[] dp = new Integer[s.length()];
        dp[0] = 1;

        int max = dp[0];
        //再最长范围内找  找到重复位置的查

        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {      //abcabcbb
            char c = s.charAt(i);
            int size = dp[i - 1];
            //上一个最长的范围内
            if (!map.containsKey(c) || map.get(c) < i - size) {
                dp[i] = size + 1;
            } else if (map.containsKey(c)) {
                dp[i] = i - map.get(c);
            }

            map.put(c, i);
            max = Math.max(max, dp[i]);
        }

        return max;


    }


}
