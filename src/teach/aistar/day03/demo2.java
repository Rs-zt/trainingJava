package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 11:51
 */
public class demo2 {
    public static void main(String[] args) {
        System.out.println(fib(3));
        System.out.println(jie(6));
        System.out.println(yh(4, 3));
    }
    public static int fib(int n){
        if (n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int jie(int m){
        if (m==1){
            return 1;
        }
        return m*jie(m-1);
    }
    public static int yh(int x,int y){
        if (x==y||y==1){
            return 1;
        }
        return yh(x-1,y)+yh(x-1,y-1);
    }
}
