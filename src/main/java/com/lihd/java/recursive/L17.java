package com.lihd.java.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-14 11:15
 **/
public class L17 {

    private List<String> result = new ArrayList<>();

    private Map<Character, List<String>> map = new HashMap<>();

    private String digits;

    public List<String> letterCombinations(String digits) {

        if (digits == null)
            return null;

        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));

        this.digits = digits;

        helper(0, new StringBuilder());

        return result;

    }

    private void helper(int index, StringBuilder stringBuilder) {

        if (index == digits.length())
            return;

        char ch = digits.charAt(index);

        final List<String> list = map.get(ch);

        if (list == null)
            return;

        for (String string : list) {

            final StringBuilder builder = new StringBuilder(stringBuilder);

            builder.append(string);

            helper(index + 1, builder);

            if (index == digits.length() - 1) {
                result.add(builder.toString());
            }
        }

    }


}


