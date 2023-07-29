package teach.aistar.day06.test;

import static teach.aistar.day03.demo5.isLeanYear;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 16:27
 */
public class demo1Utils {
    public static int Utils(int year,int mouth){
        int sum=0;
        if (mouth <= 12 && mouth > 0){
            switch (mouth){
                case 1,3,5,7,8,10,12:
                    return sum+=31;
                case 4,6,9,11:
                    return sum+=30;
                case 2:
                    if (isLeanYear(year)==366) return sum+=29;
                    return sum+=28;

            }
        }
        else System.out.println("月份输入错误");

        return -1;
    }
    public static int isLeanYear(int year){
        if ((year%400==0)||(year%4 == 0 && year%100 !=0))
            return 366;
        return 365;
    }
}
