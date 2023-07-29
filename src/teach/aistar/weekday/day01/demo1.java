package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 13:11
 * 基本数据类型
 */
public class demo1 {
    public static void main(String[] args) {
        int a=10;
        {
            byte b=127;
            System.out.println(b);
        }
        double d=2.3;
        float f=21.32f;
        short s=32;
        long l=121;
        //只能存储单个字符,使用单引号
        char c='a';
        int cc=c;
        int y=123456789;
        //int->double,不能自动转float
        float f1=y;
        System.out.println(f1);//1.23456792E8
        double d1=y;
        System.out.println(d1);//1.23456789E8

        System.out.println(cc);
        boolean flag=false;

    }
}
