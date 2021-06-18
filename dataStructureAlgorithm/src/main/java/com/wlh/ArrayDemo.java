package com.wlh;

/**
 * 数组扩容过程
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] destArr = new int[7];

        System.arraycopy(arr, 0, destArr, 1, arr.length);

        for (int i : destArr) {
            System.out.println(i);
        }
    }

}
