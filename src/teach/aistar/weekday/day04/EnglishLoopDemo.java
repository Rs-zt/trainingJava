package teach.aistar.weekday.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 20:29
 */
public class EnglishLoopDemo {
    public static void main(String[] args) {
        long sum=1L;
        //定义一个变量-记录每圈的等差值,从2,每圈都会自增2
        //凑巧-控制循环的圈数,正好500圈
        int n=2;
        //定义一个初始值
        int i=1;
        while (n<1001){
            for (int j = 0; j < 4; j++) {
                i+=n;
                sum+=i;

            }
            n+=2;
        }
        System.out.println(sum);
    }
}
