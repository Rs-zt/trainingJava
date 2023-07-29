package teach.aistar.weekday02.day06.homework;


import teach.aistar.weekday02.day06.DateUtil;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:12
 */
public class PrintCalenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();
        System.out.println("请输入月份");
        int month=sc.nextInt();
        test(year,month);
    }

    private static void test(int year, int month) {
        System.out.println("\t\t"+year+"年"+""+month+"月");
        System.out.println("日\\t一\\t二\\t三\\t四\\t五\\t六");
        //某年某月最大天数
        int maxDays= DateUtil.getMax(year,month);
        //某年某月某日(1号)是周几
        int week=DateUtil.getWeek(year,month,1);
        int now= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int count=0;
        for (int i = 0; i < week; i++) {

            System.out.print("\t");
            count++;
        }
        for (int i = 1; i < maxDays; i++) {
            System.out.print((i==now)?(i+"*\t"):(i+"\t"));
            count++;
            if (count==7){
                System.out.println();
                count=0;
            }
        }
    }
}
