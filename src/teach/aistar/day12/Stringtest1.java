package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 11:19
 */
public class Stringtest1 {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(String.class.getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(String.class.getName()+"@"+Integer.toHexString(System.identityHashCode(s2)));
//        System.out.println(s2.getClass().getName());
        System.out.println(s1.intern()==s2.intern());
    }
}
