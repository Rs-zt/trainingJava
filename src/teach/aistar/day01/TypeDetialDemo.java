package teach.aistar.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/17 17:51
 */
public class TypeDetialDemo {
    public static void main(String[] args) {
        //byte---->int,自动转
        byte m=12;
         int  n= m;
        System.out.println("n="+n);
        //char--->int ASCII
        char c='a';
        int a=c;
        System.out.println("a="+a);
        //float--->double
        float f=1.234f;
        double d=f;
        System.out.println("d="+d);
        //int转double
        int A=123456789;
        double G=A;
        System.out.println("G="+G);
        //强制转换
        int j=10;
        byte k=(byte)j;
        System.out.println("K="+k);
        System.out.println("---------------");
        int q=65;
        char C=(char)q;
        System.out.println("C="+C);
        System.out.println("------------");
        double D=1.234;
        float F=(float) D;
        System.out.println("F="+F);
    }
}
