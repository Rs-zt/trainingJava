package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 18:34
 */
public class StringBuliderAllTest {
    public static void main(String[] args) {
        String str="sdsfddfhgfhgvbcfswew";
        StringBuilder s1 = new StringBuilder(str);
        s1.append(1);
        s1.append("s");
        s1.append(true);
        s1.append(0.2f);
        s1.append(0.5d);
        s1.append(123);
        System.out.println(s1);
        int capacity = s1.capacity();
        System.out.println(capacity);
        System.out.println(s1.charAt(1));
        System.out.println(s1.codePointAt(1));
        System.out.println(s1.codePointBefore(6));
        System.out.println(s1.codePointCount(1,3));
        System.out.println(s1.insert(1,"LLLL"));
        System.out.println(s1.replace(1,5,"llll"));
        System.out.println(s1.reverse());

    }
}
