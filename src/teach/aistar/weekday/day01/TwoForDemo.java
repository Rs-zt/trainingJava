package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 16:38
 */
public class TwoForDemo {
    public static void main(String[] args) {
        //实心的矩形
        //内层循环和外部循环无关
        for (int i = 0; i <=6 ; i++) {
            for (int j = 0; j <=15 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(">>>>>>>");
        //空心矩形
        for (int i = 0; i <=6; i++) {
            for (int j = 0; j <=15 ; j++) {
                if (i==0||i==6||j==0||j==15){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //直角三角形
        //内层循环和外部循环相关
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
