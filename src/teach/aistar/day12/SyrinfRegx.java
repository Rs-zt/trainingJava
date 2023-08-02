package teach.aistar.day12;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 15:30
 */
public class SyrinfRegx {
    public static void main(String[] args) {
        String s1="i3232323l4343o4343v344e3433y343o343u3343z343t";
        String s2=s1.replaceAll("[0-9]+","-");
        String[] s3=s1.split("[0-9]+");
        System.out.println(s2);
        System.out.println(Arrays.toString(s3));
    }

}
