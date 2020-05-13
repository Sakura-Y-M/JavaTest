package com.hbgt.javase.string;

/**
 *
 * 关于Java JDK中内置的一个类：java.lang.String
 *      1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。.
 *
 *      2、在Java中随便使用双引号括起来的都是String对象。例如："abc","Hello World"。这两个都是String对象。
 *
 *      3、Java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到死亡，不可变，
 *      不能变成"abcd"，也不能变成"ab"。
 *
 *      4、在JDK当中双引号括起来的字符串，例如:"abc"都是直接存储在"方法区"的"字符串"常量池当中的。
 *      为什么SUN公司把字符串存储在一个"字符串常量池"当中？
 *      因为字符串在实际的开发中使用太频繁。为了执行效率，所以把字符串放到了方法区的字符串常量池当中。
 *
 *      5、
 *
 *
 */

public class StringTest_1 {
    public static void main(String[] args) {
        // 这两个代码表示底层创建了3个字符串对象，都在字符串常量池当中。
        String str_1 = "abcd";
        String str_2 = "abcd" + "ef";

        // 分析：这是使用new的方式创建的字符串对象。这个代码中的"xy"是从哪里来的？
        // 凡是双引号括起来的都在字符串常量池中有一份。
        // new对象的时候一定在堆内存当中开辟空间。
        String str_3 = new String("xy");
    }
}
