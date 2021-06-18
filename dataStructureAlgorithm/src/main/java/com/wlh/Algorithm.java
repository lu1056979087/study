package com.wlh;

import java.util.Arrays;

/**
 * 算法
 */
public class Algorithm {

    public static void main(String[] args) {
        int[] srcArray = {27, 39, 12, 56, 89, 76, 67, 445, 232, 145};
        Arrays.sort(srcArray);


        int location = binarySearch(srcArray, 67);
        System.out.println("location = " + location);
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;  // 起始位置（下标）
        int end = arr.length - 1;   // 结束位置（下标）

        while (start <= end) {

        }

        return -1;
    }

}
