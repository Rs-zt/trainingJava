package teach.aistar.weekday.day01;

import java.sql.SQLOutput;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 14:27
 */
public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(fei(5));
        System.out.println(jiec(4));
        System.out.println(jie(5, 1));
        System.out.println(divsor(23, 43));
        multiple(12,4);
        yanghui(5, 3);
        sortNum(324);
    }

    public static int yanghui(int a, int b) {
        if (b==1||a==b)
            return 1;
        return yanghui(a-1,b)+yanghui(a-1,b-1);
    }


    private static int fei(int n) {
        int sum;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            sum = fei(n - 1) + fei(n - 2);
        }
        return sum;
    }
    private static int jiec(int n){
        if (n==1)
            return 1;
        return jiec(n-1)*n;
    }
    private static int jie(int n,int sum){
        if (n>1){
            sum*=n;
            return jie(n-1,sum);
        }
        return sum;
    }
    //求m和n的最大公约数
    private static int divsor(int m,int n){
        //指定递归出口
        if (m%n==0)
            return n;
        return divsor(n,m%n);
    }
//    最小公倍数
    //M*n/m和n的最大公约数
private static int  multiple(int m, int n) {
    return m*n/divsor(m,n);
}
private static void sortNum(int n){
        if (n>9)
            //
            sortNum(n/10);
    System.out.print(n%10+"");
}

}
