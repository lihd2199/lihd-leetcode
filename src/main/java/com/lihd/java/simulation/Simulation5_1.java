package com.lihd.java.simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-20 10:34
 **/
public class Simulation5_1 {


    public int domino(int n, int m, int[][] broken) {

        if (n == 0 || m == 0 || broken == null)
            return -1;

        Map<List<Integer>, Integer> map = new HashMap<>();

        Set<List<Integer>> brokenList = new HashSet<>();

        for (int[] ints : broken) {
            List<Integer> tmp = new ArrayList<>();
            for (int anInt : ints) {
                tmp.add(anInt);
                brokenList.add(tmp);
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                //当前是偶数行 偶数行是开始行
                if (i % 2 == 0) {
                    //还没到最后一行
                    if (i != n - 1) {
                        //不包含当前和当前的下一行
                        List<Integer> up = new ArrayList<>();
                        List<Integer> bottom = new ArrayList<>();
                        up.add(i);
                        up.add(i1);
                        bottom.add(i + 1);
                        bottom.add(i1);
                        if (!brokenList.contains(up) && !brokenList.contains(bottom)) {
                            map.put(up, 1);
                            map.put(bottom, 1);
                            max += 1;
                        }
                        if (brokenList.contains(up)) {
                            map.put(up, -1);
                            map.put(bottom, 0);
                        }
                        if (brokenList.contains(bottom)) {
                            map.put(up, 0);
                            map.put(bottom, -1);
                        }
                    } else {
                        //最后一行是偶数 初始化最后一行
                        List<Integer> current = new ArrayList<>();
                        current.add(i);
                        current.add(i1);
                        if (brokenList.contains(current)) {
                            map.put(current, -1);
                        } else {
                            map.put(current, 0);
                        }
                    }
                }

            }
        }

        for (List<Integer> list : map.keySet()) {

            final Integer i = list.get(0);
            final Integer i1 = list.get(1);
            if ( map.get(list) == 0) {
                final ArrayList<Integer> next = new ArrayList<>();
                next.add(i);
                next.add(i1 + 1);
                if (map.get(next) != null && map.get(next) == 0) {
                    max += 1;
                    map.put(list, 1);
                    map.put(next, 1);
                }
            }

        }

        return max;


    }


}
