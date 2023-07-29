package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 17:41
 */
public class test01 {
    public static void main(String[] args) {
        //若较大数是较小数的倍数，那么较小数就是这两个数的最大公约数。
        System.out.println(Divisor(80, 40));

    }
    private static int Divisor(int a,int b){
        while (true){
            if (a%b==0)break;
            b=a%(a=b);
        }
        return b;
    }
}
