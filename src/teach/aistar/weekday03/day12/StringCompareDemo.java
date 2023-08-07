package teach.aistar.weekday03.day12;

import static teach.aistar.day12.StringTest.getStr;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 22:48
 */
public class StringCompareDemo {
    public static void main(String[] args) {
        String s1 = "a";
        //此时s2已经不在指向串池中的的字符串,指向的是堆区
        String s2 = s1 + "b";//底层new StringBuilder()/append(s1).append("b").toString();
        String s3 = "ab";
        System.out.println(s2 == s3);
        //"a"和"b"都是属于字符串常量 - 合并成"ab",直接扔到串池中
        String s4 = "a" + "b";
        System.out.println(s3 == s4);//true

        final String s5 = "a";
        //如果s5使用final修饰 - 不可变 - 常量池
        String s6 = s5 + "b";//s5是常量,还是合并成"ab"
        System.out.println(s3 == s6);//true

        System.out.println(s3 == getStr());//true

        String hello = "abcde";
        //[startIndex,endIndex)
        String s = hello.substring(1,3);

        //如果startIndex=0,return this
        String x1 = hello.substring(0);
        System.out.println(hello == x1);//true

        System.out.println(s == "bc");//false

        String p1 = "abc";
        String result = p1.concat("def");
        System.out.println("abcdef" == result);//false


    }
}
