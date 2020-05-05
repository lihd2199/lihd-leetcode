package com.lihd.java.simulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @program: lihd-leetcode
 * @description:
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 * @author: li_hd
 * @create: 2020-04-13 21:14
 **/
public class Simulation2_1 {


    public int twoCitySchedCost(int[][] costs) {

        if (costs == null || costs.length < 2 || costs.length % 2 == 1)
            return -1;


        //先假设都去A

        List<Integer> bList = new ArrayList<>();
        List<Integer> aList = new ArrayList<>();

        for (int i = 0; i < costs.length; i++) {
            if (costs[i][0] < costs[i][1]) {
                aList.add(i);
            } else {
                bList.add(i);
            }
        }

        int sum = 0;

        if (bList.size() == aList.size()) {
            for (Integer i : aList) {
                sum += costs[i][0];
            }
            for (Integer i : bList) {
                sum += costs[i][1];
            }
            return sum;
        } else if (bList.size() > aList.size()) {
            return helper(bList, aList, false, costs);
        } else {
            return helper(aList, bList, true, costs);
        }


    }


    private Integer helper(List<Integer> bigger, List<Integer> smaller, boolean aBigger, int[][] costs) {


        //B大 从去B中取出部分去A   循环取出差最小的几个
        int first;
        int second;
        if (aBigger) {
            first = 0;
            second = 1;
        } else {
            first = 1;
            second = 0;
        }

        List<Integer> tmpList = new ArrayList<>();
        for (Integer i : bigger) {
            int tmp = costs[i][second] - costs[i][first];
            tmpList.add(tmp);
        }

        tmpList.sort(Comparator.comparingInt(o -> o));

        final List<Integer> list = tmpList.subList(0, (bigger.size() - smaller.size()) / 2);


        int sum = 0;

        int a = aBigger ? 0 : 1;
        int b = aBigger ? 1 : 0;

        for (Integer i : bigger) {
            sum += costs[i][a];
        }
        for (Integer i : smaller) {
            sum += costs[i][b];
        }

        for (Integer integer : list) {
            sum -= integer;
        }


        return sum;

    }


}
