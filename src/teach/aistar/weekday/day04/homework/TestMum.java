package teach.aistar.weekday.day04.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:27
 *  给定一个参数,比如5
 *  *
 *  * 输出5+55+555+5555+55555=?
 *  *
 *  * 给定一个参数,比如3
 *  * 输出3 + 33 + 333 = ?
 */
public class TestMum {
    public static void main(String[] args) {
        test(9);
    }

    private static void test(int n) {
        int temp=0;
        String str="";
        int num=0;
        for (int i = 0; i < n; i++) {
            temp=temp*10+n;
            str+=(i!=(n-1))?(temp+"+"):(temp+"=");
            num+=temp;
        }
        System.out.println(str+num);
    }
}
