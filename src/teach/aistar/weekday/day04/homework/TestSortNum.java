package teach.aistar.weekday.day04.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:11
 * 给定一个数字,然后逆序输出
 */
public class TestSortNum{
    public static void main(String[] args) {
        System.out.println(sortDesc(34112));

    }

    private static int sortDesc(int n) {
        int result =0;
        while (true){
            int s=n/10;//求出商
            int y=n%10;//求出余数
            result =result*10+y;
            if (s==0)break;
            n=s;
        }
        return result;
    }
}
