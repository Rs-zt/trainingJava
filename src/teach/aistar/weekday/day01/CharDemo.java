package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 13:51
 */
public class CharDemo {
    public static void main(String[] args) {
        char c='a'+1;
        System.out.println(c);
        int n=1;
        char c2= (char) ('a'+n);
        System.out.println(c2);
        char c3='\r';
        System.out.println("hello"+c3+"world");
        //[\u0000,\uffff]
        char c6='\u03c0';//直接定义Unicode-十六进制
        System.out.println(c6);
    }
}
