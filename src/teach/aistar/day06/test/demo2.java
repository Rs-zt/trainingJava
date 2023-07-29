package teach.aistar.day06.test;

import java.util.Calendar;
import java.util.Scanner;

import static teach.aistar.day06.test.demo1Utils.Utils;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 19:04
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份-->");
        int year = sc.nextInt();
        System.out.print("请输入月份-->");
        int mouth = sc.nextInt();
        test(year, mouth);
    }

    private static int test(int year, int month) {
        int sum = 0;
        if (month <= 12 && month > 0) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return sum += 31;
                case 4, 6, 9, 11:
                    return sum += 30;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) return sum += 29;
                    return sum += 28;

            }
        }
        return sum;
    }
}
