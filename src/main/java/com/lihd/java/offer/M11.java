package com.lihd.java.offer;

/**
 * @program: lihd-leetcode
 * @description: 旋转数组的最小数字  https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 * @author: li_hd
 * @create: 2020-04-08 18:04
 **/
public class M11 {

    public int minArray(int[] numbers) {

        if (numbers == null || numbers.length == 0)
            return -1;

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if(min <= numbers[i])
                min = numbers[i];
            else
                return numbers[i];

        }

        return numbers[0];

    }


}
