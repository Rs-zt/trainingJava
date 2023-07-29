package teach.aistar.day02;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/18 14:39
 */
public class demo2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        int d=10;
        int s=20;
        d=d^s;
        s=d^s;
        d=d^s;
        System.out.println(d);
        System.out.println(s);
        int q=100;
        int w=200;
        int temp;
        temp=q;
        q=w;
        w=temp;
        System.out.println(q);
        System.out.println(w);
        int x=1000;
        int y=2000;
        y=x^(x=y)^y;
        System.out.println(x);
        System.out.println(y);
    }
}
