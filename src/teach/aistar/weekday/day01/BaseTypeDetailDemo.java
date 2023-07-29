package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 13:43
 */
public class BaseTypeDetailDemo {
    public static void main(String[] args) {
        short s=10;
        byte b= (byte) s;
        float f= (float) 3.12;
        long now=1233;//int-->转long
        long o= 123435252l;
        System.out.println(o);
        //定义二进制,以0b开始
        int bn=0b1001;
        System.out.println(bn);//9
        //定义八进制,以0开头
        int oca=032;
        System.out.println(oca);//26
        //定义十六进制,以0x开头
        int hex=0x00b0;
        System.out.println(hex);//176
        short s1=1;
        s1+=1;
        System.out.println(s1);//jvm底层自动转

    }
}
