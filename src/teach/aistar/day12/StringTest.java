package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 11:00
 */
public class StringTest {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);//true
        String s3=new String("abc");
        System.out.println(s1==s3);//false
        String a="a";
        String b=a+"bc";
        System.out.println(b==s1);//false
        final String c="a";
        String d=c+"bc";
        System.out.println(d==s1);//true
        String s4=s1.substring(1,3);
        System.out.println(s4=="bc");//false
        String s5=s1.substring(0);//
        System.out.println(s5==s1);//true
        System.out.println(s1==getStr());//true

    }
    public static String getStr(){
        return "abc";
    }
}
