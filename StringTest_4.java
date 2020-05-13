package com.hbgt.javase.string;

/**
 *
 * 关于String类中的构造方法
 *      第一个：String s = new String("123");
 *      第二个：String s = "123";
 *      第三个：String s = new String(char数组);
 *      第三个：String s = new String(char数组,起始下标,长度);
 *      第五个：String s = new String(byte数组);
 *      第六个：String s = new String(byte数组,起始下标,长度);
 *
 */

public class StringTest_4 {
    public static void main(String[] args) {

        // 创建字符串对象最常用的一种方式
        String str_1 = "Hello World!";
        // str_1这个变量中保存的是一个内存地址
        // 按说以下应该输出一个内存地址。
        // 但是输出一个字符串，说明String类已经重写了toString()方法。
        System.out.println(str_1);
        System.out.println(str_1.toString());

        // 这里只掌握常用的构造方法。
        byte[] bytes_1 = {97,98,99};

        String str_2 = new String(bytes_1);

        // 前面说过：输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址
        // 通过输出结果我们得出一个结论：String类已经重写了toString()方法。
        // 输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。
        System.out.println(str_2.toString());
        System.out.println(str_2);

        // String(字节数组,数组元素下标的起始位置,长度);
        String str_3 = new String(bytes_1,1,2);
        System.out.println(str_3); // bc

        // 将char数组全部转换成字符串
        char[] chars = {'我','是','架','构','师'};
        String str_4 = new String(chars);
        System.out.println(str_4);

        // 将char数组的一部分转换成字符串
        String str_5 = new String(chars,2,3);
        System.out.println(str_5);
    }
}
