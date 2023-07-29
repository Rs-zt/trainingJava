package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 16:59
 */
public class demo6 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str1 == str3);
    }
}
