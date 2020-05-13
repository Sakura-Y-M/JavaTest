package com.hbgt.javase.string;

/**
 *
 * 分析一下程序一共创建了几个对象
 *
 */

public class StringTest_3 {
    public static void main(String[] args) {
        /*
        一共3个对象：
            方法区字符串常量池有1个:"hello"
            堆内存当中有两个String对象。
            一共3个。
         */

        String str_1 = new String("ABC");
        String str_2 = new String("ABC");
    }
}
