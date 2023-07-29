package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 14:54
 */
public class demo5 {
    public static void main(String[] args) {
        getMax(2023,2);
    }
    public static int getMax(int year,int mouth){
        if (mouth <= 12 && mouth > 0){
            switch (mouth){
                case 1,3,5,7,8,10,12:
                    System.out.println("31天");
                    break;
                case 4,6,9,11:
                    System.out.println("30天");
                    break;
                case 2:
                    if (isLeanYear(year)==true) System.out.println("29天");
                    System.out.println("28天");

            }
        }
        else System.out.println("月份输入错误");

            return -1;
    }
    public static boolean isLeanYear(int year){
        if ((year%400==0)||(year%4 == 0 && year%100 !=0))
            return true;
        return false;
    }

}
