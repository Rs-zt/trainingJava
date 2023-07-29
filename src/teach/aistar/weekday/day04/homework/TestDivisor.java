package teach.aistar.weekday.day04.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:30
 */
public class TestDivisor {
    public static void main(String[] args) {
        System.out.println(divisor(20,12));
    }

    private static int divisor(int m, int n) {

        while (true){
            int y=m%n;
            if (y==0){
                break;
            }
            m=n;
            n=y;
        }
        return n;
    }
}
