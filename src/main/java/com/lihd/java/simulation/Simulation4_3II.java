package com.lihd.java.simulation;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-17 09:59
 **/
public class Simulation4_3II {

    public String countOfAtoms(String formula) {

        boolean isFirstLeft = true;

        StringBuilder builder = new StringBuilder();

        int multiple = 1;

        int count = 0;

        Map<String, Integer> map = new TreeMap<>();

        final int length = formula.length();

        for (int i = 0; i < length; i++) {

            final char c = formula.charAt(i);

            if (c == '(') {
                if(isFirstLeft){
                    initLeftBlock(formula, i);
                }
                isFirstLeft = false;
                single(map,builder,i,multiple,formula);
                continue;
            }


            if (c == ')') {
                single(map,builder,i,multiple,formula);
                continue;
            }
            if (isBigger(c)) {

                //前面没有数字 但是已经结束了
                single(map,builder,i,multiple,formula);

                //遇到大写字母  初始化当前元素的倍数
                multiple = getMultipleByBigger(formula, i);
                builder = new StringBuilder();
                builder.append(c);

                if (i == length - 1) {
                    map.merge(builder.toString(), multiple, Integer::sum);
                }
            } else if (isLetter(c)) {
                builder.append(c);
                if (i == length - 1) {
                    map.merge(builder.toString(), multiple, Integer::sum);
                }
            } else if (isNumber(c)) {
                //首先判断  不是在')'后面
                boolean flag = false;
                int s = i;
                while (s != -1) {
                    final char c1 = formula.charAt(s);
                    if (isNumber(c1)) {
                        s = s - 1;
                    }
                    if (!isNotBlock(c1)) {
                        break;
                    }
                    if (isLetter(c1) || isBigger(c1)) {
                        flag = true;
                        break;
                    }
                }

                //不是在')'后面 说明是元素的倍数
                if (flag) {
                    count = count * 10 + Integer.parseInt(String.valueOf(c));
                    if (i == length - 1 || !isNumber(formula.charAt(i + 1))) {
                        //下一个不是  说明个数到此为止
                        map.merge(builder.toString(), multiple * count, Integer::sum);
                        count = 0;
                    }
                }

            }

        }

        StringBuilder stringBuilder = new StringBuilder();

        map.keySet().forEach(e -> {
            stringBuilder.append(e);
            if (map.get(e) != 1) {
                stringBuilder.append(map.get(e));
            }
        });

        return stringBuilder.toString();

    }


    //前面没有数字 但是其实已经结束了
    private void single(Map<String, Integer> map, StringBuilder builder, int i, int multiple,String formula) {

        if (i != 0 && (isLetter(formula.charAt(i - 1)) || isBigger(formula.charAt(i - 1)))) {
            map.merge(builder.toString(), multiple, Integer::sum);
        }

    }


    //初始化 每个括号的倍数
    private Map<Integer, Integer> multipleMap = new HashMap<>();

    private void initLeftBlock(String string, int index) {

        final int length = string.length();
        int left = 0;
        int right = 0;
        for (int i = index + 1; i < length; i++) {
            final char c = string.charAt(i);
            if (c == '(') {
                if (multipleMap.get(i) == null) {
                    initLeftBlock(string, i);
                }
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


    //给定一个大写字母的位子
    private Integer getMultipleByBigger(String string, int index) {

        int left = 0;
        int right = 0;

        Integer multiple = 1;

        for (int i = index - 1; i >= 0; i--) {

            final char c = string.charAt(i);
            if (c == ')') {
                right += 1;
            }

            if (c == '(' && right > left) {
                left += 1;
            }

            if (c == '(' && right <= left) {
                multiple *= multipleMap.getOrDefault(i, 1);
            }
        }
        return multiple;
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

    private boolean isNotBlock(char c) {
        return c != '(' && c != ')';
    }


}
