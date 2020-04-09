package com.lihd.java.dp;

import com.lihd.java.common.Type;
import com.lihd.java.common.TypeValue;

/**
 * @program: lihd-leetcode
 * @description: 最长回文子串  https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @author: li_hd
 * @create: 2020-04-03 15:21
 **/
public class L5 {


    /**
     * 1、注意边界条件
     * 2、注意初始化数据
     * 3、注意执行的先后顺序
     */
    @Type(value = TypeValue.dp)
    public String longestPalindrome(String s) {

        if (s == null)
            return null;

        if (s.length() == 1 || s.length() == 0)
            return s;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        String max = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < i; j++) {

                dp[j][i] = s.charAt(i) == s.charAt(j);

                if (j + 1 != i) {
                    dp[j][i] = dp[j][i] && dp[j + 1][i - 1];
                }


                if (dp[j][i] && (i - j + 1) > max.length())
                    max = s.substring(j, i + 1);

            }
        }

        return max;

    }




}
