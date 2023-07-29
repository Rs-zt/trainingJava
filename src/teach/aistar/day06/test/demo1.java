package teach.aistar.day06.test;

import java.util.Calendar;
import java.util.Scanner;

import static teach.aistar.day06.test.demo1Utils.Utils;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 16:27
 *  //1. 某年某月最大天数
 *         //2. 某年某月某日(1号)是周几
 *         //3. 今天是几号   24*
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份-->");
        int year=sc.nextInt();
        System.out.print("请输入月份-->");
        int mouth=sc.nextInt();
        Utils(year,mouth);
        test(year,mouth);
    }
    private static void test(int year, int month) {
        System.out.println("\t\t"+year+"年"+" "+month+"月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        Calendar cal=Calendar.getInstance();
        cal.set(year, month-1,1);
//        System.out.println(cal.getTime());
         int days=cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println(days);
        //1. 某年某月最大天数
        //2. 某年某月某日(1号)是周几
        //3. 今天是几号   24*
        Calendar cal1=Calendar.getInstance();
       int y= cal1.get(Calendar.YEAR);
        int m=cal1.get(Calendar.MONTH)+1;
//        System.out.println(cal1.getTime());
        int day=cal1.get(Calendar.DAY_OF_MONTH);
        int count=0;
        for (int i = 1; i <days ; i++) {
            System.out.print("\t");
            count++;
        }
        for (int i = 1 ;i <=demo1Utils.Utils(year, month) ; i++) {
            if (count==6){
                System.out.println(i);
                count=0;
            } else if (y==cal.get(Calendar.YEAR)&&m==cal.get(Calendar.MONTH)&&day==i) {
                System.out.print(i+"* ");
                count++;
            } else {
                System.out.print(i+"\t");
                count++;
            }
        }


    }

}
