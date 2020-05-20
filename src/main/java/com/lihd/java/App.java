package com.lihd.java;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        final App app = new App();
        final int i = app.minNumberInRotateArray(new int[]{66501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913, 9962, 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465, 4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6335});
        System.out.println(i);

    }

    public int minNumberInRotateArray(int[] array) {
        return helper(array, 0, array.length - 1);
    }

    private int helper(int[] array, int left, int right) {
        if (left >= right) {
            return Math.min(array[left], array[right]);
        }
        int center = (left + right) / 2;
        int c = array[center];
        if (c < array[right]) {
            //右面符合
            return Math.min(c, helper(array, left, center - 1));
        } else {
            //左面符合
            return Math.min(c, helper(array, center + 1, right));
        }
    }

}
