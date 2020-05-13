package com.hbgt.javase.string;

/**
 *
 * String类中的常用方法
 *      第一个（掌握）：char charAt(int index)
 *
 *      第二个（了解）：int compareTo(String anotherString)
 *          作用：
 *          字符串之间比较大小不能直接使用 > < ，需要使用compareTo方法。
 *          compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
 *
 *      第三个（掌握）：boolean contains(CharSequence s)
 *          作用：
 *          判断前面的字符串中是否包含后面的子字符串。
 *
 *      第四个（掌握）：boolean endsWith(String suffix)
 *          作用：
 *          判断当前字符串是否以某个字符串结尾。
 *
 *      第五个（掌握）：boolean equals(Object anObject)
 *          作用：
 *          比较两个字符串必须使用equals方法，不能使用"=="。
 *
 *      第六个（掌握）：boolean equalsIgnoreCase(String anotherString)
 *          作用：
 *          判断两个字符串是否相等，并且同时忽略大小写。
 *
 *      第七个（掌握）：byte[] getBytes()
 *          作用：
 *          将字符串对象转换成字节数组
 *
 *      第八个（掌握）：int indexOf(String str)
 *          作用：
 *          判断某个子字符串在当前字符串中第一次出现处的索引。
 *
 *      第九个（掌握）：boolean isEmpty()
 *          作用：
 *          判断某个字符串是否为空字符串。底层源代码调用的应该是length()方法。
 *
 *      第十个（掌握）：int length()
 *          作用：
 *          面试题：判断数组长度和判断字符串长度不一样
 *          判断数组长度是length属性，判断字符串长度是length()方法。
 *
 *      第十一个（掌握）：int lastIndexOf(String str)
 *          作用：
 *          判断某个子字符串在当前字符串中最后一次出现的索引
 *
 *      第十二个（掌握）：String  replace(CharSequence target, CharSequence replacement)
 *          作用：
 *          替换。
 *          String的父类接口就是：CharSequence
 *
 *      第十三个（掌握）：String[]  split(String regex)
 *          作用：
 *          拆分字符串
 *
 *      第十四个（掌握）：boolean startsWith(String prefix)
 *          作用：
 *          判断某个字符串是否以某个子字符串开始。
 *
 *      第十五个（掌握）：String  substring(int beginIndex)
 *          作用：
 *          截取字符串
 *
 *      第十六个（掌握）：String  substring(int beginIndex, int endIndex)
 *          作用：
 *          beginIndex起始位置（包括）
 *          endIndex结束位置（不包括）
 *
 *      第十七个（掌握）：char[] toCharArray()
 *          作用：
 *          将字符串转换成char数组
 *
 *      第十八个（掌握）：String  toLowerCase()
 *          作用：
 *          转换为小写。
 *
 *      第十九个（掌握）：String  toUpperCase()
 *          作用：
 *          转换为大写。
 *
 *      第二十个（掌握）：String  trim()
 *          作用：
 *          去除字符串前后空白,空格
 *
 *      第二十一个（掌握）：static String valueOf(boolean b)
 *          作用：
 *          String中唯一一个静态方法，不需要new对象，将"非字符串"转换成"字符串"
 *          参数是一个对象的时候，会自动调用该对象的toString()方法
 *          本质上System.out.println();这个方法在输出任何数据的时候都是先转换成字符串，再输出。
 *
 */

public class StringTest_5 {
    public static void main(String[] args) {
        // 第一个（掌握）：char charAt(int index)
        char c_1 = "架构师".charAt(1); // 双引号括起来的中国人是一个字符串对象，所以可以"."。
        System.out.println(c_1);// 结果：构

        // 第二个（了解）：int compareTo(String anotherString)
        // 字符串之间比较大小不能直接使用 > < ，需要使用compareTo方法。
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        int sum_1 = "abc".compareTo("abc");
        System.out.println(sum_1);// 结果：0 前后一致 10 - 10 = 0

        int sum_2 = "abcd".compareTo("abce");
        System.out.println(sum_2);// 结果：-1(小于0) 前小后大 8 - 9 = -1

        int sum_3 = "abce".compareTo("abcd");
        System.out.println(sum_3);// 结果：1(大于0) 前大后小 9 - 8 = 1

        // 拿着字符串第一个字母和后面字符串的第一个字母比较。能分出胜负就不再比较了。
        int sum_4 = "xyz".compareTo("yxz");
        System.out.println(sum_4);// 结果：-1

        // 第三个（掌握）：boolean contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串。
        System.out.println("HelloWorld.java".contains(".java"));// 结果：true
        System.out.println("http://www.baidu.com".contains("https://"));// 结果:false

        //第四个（掌握）：boolean endsWith(String suffix)
        // 判断当前字符串是否以某个字符串结尾。
        System.out.println("test.txt".endsWith(".java")); // false
        System.out.println("test.txt".endsWith(".txt")); // true

        // 第五个（掌握）：boolean equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用"=="。
        // equals方法有没有调用compareTo方法？老版本可以看一下。JDK13中并没有调用compareTo()方法。
        System.out.println("abc".equals("abc"));// 结果：true

        // 第六个（掌握）：boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("ABc".equalsIgnoreCase("abc")); // 结果：true

        // 第七个（掌握）：byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for (byte x:bytes
             ) {
            System.out.println(x);
        }

        // 第八个（掌握）：int indexOf(String str)
        // 判断某个子字符串在当前字符串中第一次出现处的索引。
        System.out.println("oraclejavac++.newtc#phppythonjavaoraclec++".indexOf("java"));// 结果：6

        // 第九个（掌握）：boolean isEmpty()
        // 判断某个字符串是否为空字符串。底层源代码调用的应该是length()方法。
        // String str_1 = "";
        String str_1 = "ab";
        // System.out.println(str_1.isEmpty());// 结果：true
        System.out.println(str_1.isEmpty());// 结果：false

        // 第十个（掌握）：int length()
        // 面试题：判断数组长度和判断字符串长度不一样
        // 判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length());// 结果：3

        // 第十一个（掌握）：int lastIndexOf(String str)
        // 判断某个子字符串在当前字符串中最后一次出现的索引
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java"));// 结果：22

        // 第十二个（掌握）：String  replace(CharSequence target, CharSequence replacement)
        // 替换。
        // String的父类接口就是：CharSequence
        String newString_1 = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString_1);

        // 第十三个（掌握）：String[]  split(String regex)
        // 拆分字符串
        String[] ymd = "1980-10-11".split("-");
        for (String x:ymd
             ) {
            System.out.println(x);
        }
        String param = "name=zs&password=111";
        String[] params = param.split("&");
        for (String x:params
             ) {
            System.out.println(x);
        }

        // 第十四个（掌握）：boolean startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http"));// 结果：true
        System.out.println("http://www.baidu.com".startsWith("https"));// 结果：false

        // 第十五个（掌握）：String  substring(int beginIndex)
        // 截取字符串
        System.out.println("http://www.baidu.com".substring(7)); // 结果：www.baidu.com

        // 第十六个（掌握）：String  substring(int beginIndex, int endIndex)
        // beginIndex起始位置（包括）
        // endIndex结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));// 结果：www

        // 第十七个（掌握）：char[] toCharArray()
        // 将字符串转换成char数组
        char[] chars = "我是架构师".toCharArray();
        for (char c:chars
             ) {
            System.out.println(c);
        }

        // 第十八个（掌握）：String  toLowerCase()
        // 转换为小写。
        System.out.println("ABCDabcd".toLowerCase());

        // 第十九个（掌握）：String  toUpperCase()
        // 转换为大写
        System.out.println("ABCDabcd".toUpperCase());

        // 第二十个（掌握）：String  trim()
        // 去除字符串前后空白,空格
        System.out.println("   Hello   World   ".trim());

        // 第二十一个（掌握）：static String valueOf(boolean b)
        // String中唯一一个静态方法，不需要new对象，将"非字符串"转换成"字符串"
        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(100);
        //String s1 = String.valueOf(3.14);

        // 参数是一个对象的时候，会自动调用该对象的toString()方法
        String s1 = String.valueOf(new Customer_1());
        // 本质上System.out.println();这个方法在输出任何数据的时候都是先转换成字符串，再输出。
        System.out.println(s1);// 没有重写toString方法之前是对象内存地址
    }
}
class Customer_1{

    // 重写toString()方法
    @Override
    public String toString() {
        return "我是一名Java架构师！";
    }
}
