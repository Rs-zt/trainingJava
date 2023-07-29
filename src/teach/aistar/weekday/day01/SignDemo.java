package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 14:05
 */
public class SignDemo {
    public static void main(String[] args) {
        System.out.println(9/2);
        int n=2023;
        System.out.println("千位:"+n/1000);
        System.out.println("百位:"+n/100%10);
        System.out.println("十位:"+n/10%10);
        System.out.println("个位:"+n%10);
        //偶数二进制的特点???0&1=0
        //奇数的二进制特点 ??1&1=1
        System.out.println((11&1)==0);
        System.out.println(10|8);
        //异或,相同为0,不同为1
        System.out.println(10^8);
    }
}
