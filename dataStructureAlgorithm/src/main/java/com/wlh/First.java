package com.wlh;

public class First {
    // dev 增加了第二个类

    public static void main(String[] args) {
        String a = "hello world";
        First.find(a);
    }

    public static <T> Zero find(T an) {
        return new Zero();
    }
}
