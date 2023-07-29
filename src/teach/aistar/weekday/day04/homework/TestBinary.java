package teach.aistar.weekday.day04.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:37
 *  while实现十进制转二进制
 */
public class TestBinary {
    public static void main(String[] args) {
        System.out.println(toBinaryInt(10));
    }

    private static int toBinaryInt(int n) {
        int result=0;
        //定义一个计数器
        int count=0;
        while (true){
            //求出商
            int s=n/2;
            //求出余数
            int y=n%2;
            //拼接余数-先出来的需要放到字符串的后面
            result=(int)(y*Math.pow(10,count++)+result);
            if (s==0)
                break;
            n=s;
        }
        return result;
    }
    public static String toBinary(int n){
        String str="";
        while (true){
            //求出商
            int s = n / 2;//10 / 2 = 5;

            //求出余数
            int y = n % 2;// 10 % 2 = 0

            //拼接余数 - 先出来的需要放到字符串的后边
            // 1 0 1 0
            str = y + str;

            if(s == 0)
                break;

            //下一轮循环之前
            n = s;
        }
        return str;
    }
}
