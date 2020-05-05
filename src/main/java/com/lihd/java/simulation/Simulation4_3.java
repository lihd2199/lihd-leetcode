package com.lihd.java.simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-16 19:16
 **/
public class Simulation4_3 {

    public String countOfAtoms(String formula) {


        final Map<String, Integer> deal = deal(formula);

        TreeMap<String, Integer> result = new TreeMap<>();

        for (String key : deal.keySet()) {

            final Map<String, Integer> map = helperNoBlock(key, deal.getOrDefault(key, 1));

            for (String str : map.keySet()) {

                result.merge(str, map.get(str), Integer::sum);

            }
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (String next : result.keySet()) {
            final Integer integer = result.get(next);
            stringBuilder.append(next);
            if (integer != 1) {
                stringBuilder.append(integer);
            }
        }

        return stringBuilder.toString();

    }


    //左括号的位置  和他的倍数
    private Map<Integer, Integer> multipleMap = new HashMap<>();


    private void getNum(String string, int index) {

        final int length = string.length();

        int left = 0;
        int right = 0;

        for (int i = index + 1; i < length; i++) {

            final char c = string.charAt(i);
            if (c == '(') {
                left += 1;
                continue;
            }

            if (c == ')' && left != right) {
                right += 1;
                continue;
            }

            if (c == ')') {
                //说明之后的数字 就是我们需要的
                if (i != length - 1) {
                    int num = i + 1;
                    char t = string.charAt(num);
                    int count = 0;
                    while (isNumber(t)) {
                        count = count * 10 + Integer.parseInt(String.valueOf(t));
                        if (num != length - 1) {
                            t = string.charAt(num + 1);
                            num++;
                        } else {
                            multipleMap.put(index, count);
                            return;
                        }
                    }
                    multipleMap.put(index, count);
                    return;
                } else {
                    multipleMap.put(index, 1);
                    return;
                }
            }

        }


    }

    private Map<String, Integer> deal(String string) {

        Map<String, Integer> map = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();

        int length = string.length();

        int multiple = 1;

        for (int i = 0; i < length; i++) {

            char c = string.charAt(i);
            //是字母 或者 数字(不在括号后面的数字，左括号右括号无所谓)  一定是往后拼
            if (isBigger(c) || isLetter(c)) {
                stringBuilder.append(c);
            }
            if (isNumber(c)) {
                int s = i;
                while (s != -1) {
                    final char c1 = string.charAt(s);
                    if (isNumber(c1)) {
                        s = s - 1;
                    }
                    if (!isNotBlock(c1)) {
                        break;
                    }
                    if (isLetter(c1) || isBigger(c1)) {
                        stringBuilder.append(c);
                        break;
                    }
                }
            }


            //不论是左括号 还是右括号 都代表前面一段结束了  怎么找这一段的倍数
            if (string.charAt(i) == '(') {

                getNum(string, i);

                if ("".equals(stringBuilder.toString())) {
                    continue;
                }

                //找到当前的倍数  和 被包含的倍数
                if (i != 0) {
                    List<Integer> leftIndexs = getLeftIndexList(string, i);
                    for (Integer leftIndex : leftIndexs) {
                        multiple *= multipleMap.getOrDefault(leftIndex, 1);
                    }
                }
                map.merge(stringBuilder.toString(), multiple, Integer::sum);


                stringBuilder = new StringBuilder();
                multiple = 1;
                continue;
            }


            if (string.charAt(i) == ')') {
                if ("".equals(stringBuilder.toString())) {
                    continue;
                }

                if (i != 0) {
                    List<Integer> leftIndexs = getLeftIndexList(string, i);
                    for (Integer leftIndex : leftIndexs) {
                        multiple *= multipleMap.getOrDefault(leftIndex, 1);
                    }
                }
                map.merge(stringBuilder.toString(), multiple, Integer::sum);
                stringBuilder = new StringBuilder();
                multiple = 1;
                continue;
            }

            if (i == length - 1) {
                if ("".equals(stringBuilder.toString())) {
                    continue;
                }
                map.merge(stringBuilder.toString(), 1, Integer::sum);
            }


        }

        return map;
    }

    private List<Integer> getLeftIndexList(String string, int index) {

        int left = 0;
        int right = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = index - 1; i >= 0; i--) {

            final char c = string.charAt(i);
            if (c == ')') {
                right += 1;
            }

            if (c == '(' && right > left) {
                left += 1;
            }

            if (c == '(' && right <= left) {
                list.add(i);
            }

        }

        return list;

    }

    private boolean isNotBlock(char c) {
        return c != '(' && c != ')';
    }


    private Map<String, Integer> helperNoBlock(String subString, int num) {

        Map<String, Integer> map = new HashMap<>();

        final int length = subString.length();

        StringBuilder builder = new StringBuilder();

        int count = 0;

        for (int i = 0; i < length; i++) {

            char t = subString.charAt(i);
            if (isBigger(t)) {
                //上一个不是数字
                if (i != 0 && (isLetter(subString.charAt(i - 1)) || isBigger(subString.charAt(i - 1)))) {
                    map.merge(builder.toString(), num, Integer::sum);
                }
                builder = new StringBuilder();
                builder.append(t);
                if (i == length - 1) {
                    map.merge(builder.toString(), num, Integer::sum);
                }
            } else if (isLetter(t)) {
                builder.append(t);
                if (i == length - 1) {
                    map.merge(builder.toString(), num, Integer::sum);
                }
            } else if (isNumber(t)) {
                count = count * 10 + Integer.parseInt(String.valueOf(t));
                if (i == length - 1 || !isNumber(subString.charAt(i + 1))) {
                    //下一个不是  说明个数到此为止
                    map.merge(builder.toString(), num * count, Integer::sum);
                    count = 0;
                }
            }


        }

        return map;
    }

    private boolean isBigger(char t) {
        return t >= 'A' && t <= 'Z';
    }

    private boolean isLetter(char t) {
        return t >= 'a' && t <= 'z';
    }

    private boolean isNumber(char t) {
        return !(t >= 'A' && t <= 'Z') && !(t >= 'a' && t <= 'z') && t != '(' && t != ')';
    }


}
