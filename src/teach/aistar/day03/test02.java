package teach.aistar.day03;

import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 18:55
 */
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输出N项值");
        int n= sc.nextInt();
        System.out.println(fib(n));
    }
    private static int fib(int n){
        int x=1;
        int y=1;
        int sum=0;

        for (int i = 1; i <= n; i++) {
            if (i==1)  sum=1;
            if(i==2)  sum=1;
            if (i>2){
                sum=x+y;
                y=x;
                x=sum;
//                System.out.println(sum);
            }

        }
        return sum;
    }
}
