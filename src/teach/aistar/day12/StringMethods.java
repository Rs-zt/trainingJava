package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 14:39
 */
public class StringMethods {
    public static void main(String[] args) {
        String s1="abc";
        String s2="DEF";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(1,3));
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.lastIndexOf("c"));
//        System.out.println("192.168.1.111".split("\\."));

        System.out.println();
    }
}
