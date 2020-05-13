package com.hbgt.javase.string;

public class StringTest_2 {
    public static void main(String[] args) {
        String str_1 = "ABC";
        // "ABC"是存储在方法区的字符串常量池当中
        // 所以这个"ABC"不会新建。（因为这个对象已经存在了）
        String str_2 = "ABC";

        System.out.println(str_1 == str_2);// true

        String str_3 = new String("SSS");
        String str_4 = new String("SSS");

        // == 双等号比较的是变量中保存的内存地址
        System.out.println(str_3 == str_4);// false

        // 通过此程序的学习，我们知道了字符串对象之间的比较不能使用"=="。
        // "=="不保险。应该调用String类的equals方法。
        // String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法。
        System.out.println(str_3.equals(str_4));// true

        String k = new String("TXT");
        // String k = null;
        // "TXT"这个字符串可以后面加"."呢？
        // 因为"TXT"是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("TXT".equals(k));// 建议使用这种方式，因为这个可以避免空指针异常。
        System.out.println(k.equals("TXT"));// 存在空指针异常的风险。不建议这样写！
    }
}
