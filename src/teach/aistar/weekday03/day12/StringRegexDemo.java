package teach.aistar.weekday03.day12;

import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 23:05
 */
public class StringRegexDemo {
    public static void main(String[] args) {
        String loves="i13l343o242v2323e889y343o43u";

        System.out.println(loves.replaceAll("\\d+","-"));


        //根据数字切割
        //String[] arr = loves.split("\\d+");
        //System.out.println(Arrays.toString(arr));

        System.out.println("===========");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:>");
        String str = sc.nextLine();

        //String regex = "[a-z]";

        //String regex = "[a-z]{2}";

        //username一般都是小写字母开头,由数字,字母以及下划线组成,长度5-8位
        //\w => [a-zA-Z0-9_]
        //String regex = "[a-z]\\w{4,7}";

        //String regex = "\\d+";

        //String regex = "\\s";//tab,一个空格
        //String regex = "[\\u4e00-\\u9fa5]+";

        String regex = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";

        //输入的str字符串是否匹配这个regex正则表达式
        if(str.matches(regex)){
            System.out.println("ok");
        }else{
            System.out.println("不匹配!");
        }
    }
}
