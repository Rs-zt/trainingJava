package teach.aistar.day12;

import java.util.StringJoiner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/5 9:19
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
        String[] str={"admin","jack","kangkang"};
        StringJoiner joiner = new StringJoiner("-");//分隔符拼接数组
        StringJoiner joiner1 = new StringJoiner("-","hello","!");//指定头和尾部
        for (String s : str) {
            joiner1.add(s);
        }
        System.out.println(joiner1.toString());
    }
}
