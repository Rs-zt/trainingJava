package teach.aistar.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/17 17:46
 */
public class BaseTypeDemo {
    public static void main(String[] args) {
        //在同一个{}中不能出现重复的变量名
        int a=10;
//        {
//            int a=10;
//        }
        {
            int b=10;
        }
        {
            int b=20;
            System.out.println(b);
        }
        System.out.println(a);
    }
}
