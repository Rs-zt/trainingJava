package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 14:10
 * 交换两个变量值
 */
public class SwapVarDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int tem=a;
        a=b;
        b=tem;
        System.out.println(a);
        System.out.println(b);
        int i=100;
        int j=200;
        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println(i);
        System.out.println(j);
        int m=120;
        int n=240;
        m=n^(n=m)^m;
        System.out.println(m);
        System.out.println(n);
    }
}
