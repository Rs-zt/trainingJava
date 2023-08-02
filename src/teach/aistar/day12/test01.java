package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 19:59
 */
public class test01 {
    public static void main(String[] args) {
//        String s = new String("1");
//        String s4 = new String("1");

        String s1=new String("1")+new String("11");
        s1.intern();
        String s2="111";
        System.out.println(s1==s2);
    }
}
